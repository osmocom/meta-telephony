DESCRIPTION = "Osmocom GSM/UMTS Home Location Register"
DEPENDS = "libosmocore libosmo-abis sqlite3 sqlite3-native"
HOMEPAGE = "http://osmocom.org/projects/osmo-hlr"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "file://osmo-hlr.init"

INC_PR = "r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools update-rc.d pkgconfig

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
	echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -m 0660 ${S}/doc/examples/osmo-hlr.cfg ${D}${sysconfdir}/osmocom/osmo-hlr.cfg

	# Install sysv-init files
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0775 ${WORKDIR}/osmo-hlr.init ${D}${sysconfdir}/init.d/osmo-hlr

	# Install systemd files and enable on sysinit
	install -d ${D}${systemd_unitdir}/system
	install -m 0644 ${S}/contrib/systemd/osmo-hlr.service ${D}${systemd_unitdir}/system/

	install -d ${D}/var/lib/osmocom
	sqlite3 ${D}/var/lib/osmocom/hlr.db < ${S}/sql/hlr.sql
}

INITSCRIPT_PACKAGES = "osmo-hlr"

# Do not start any of the services by default
SYSTEMD_AUTO_ENABLE = "disable"

CONFFILES_${PN} = "${sysconfdir}/osmocom/osmo-hlr.cfg"
INITSCRIPT_NAME_${PN} = "osmo-hlr"
INITSCRIPT_PARAMS_${PN} = "defaults 30 30"

FILES_${PN} += "${systemd_unitdir}/system/osmo-hlr.service"
