DESCRIPTION = "OsmoHNBGW, libosmo-ranap"
DEPENDS = "libosmocore libosmo-abis libosmo-netif libosmo-sccp libasn1c"
HOMEPAGE = "http://osmocom.org/projects/cellular-infrastructure"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

SRC_URI = "file://osmo-hnbgw.init"

INC_PR = "r1.${META_TELEPHONY_OSMO_INC}"

#EXTRA_OECONF += " "

inherit autotools update-rc.d pkgconfig

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
	echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -m 0660 ${S}/doc/examples/osmo-hnbgw.cfg ${D}${sysconfdir}/osmocom/osmo-hnbgw.cfg

	# Install sysv-init files
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0775 ${WORKDIR}/osmo-hnbgw.init ${D}${sysconfdir}/init.d/osmo-hnbgw

	# Install systemd files and enable on sysinit
	install -d ${D}${systemd_unitdir}/system
	for i in `ls ${S}/contrib/systemd`; do
		install -m 0644 ${S}/contrib/systemd/$i ${D}${systemd_unitdir}/system/
	done

	install -d ${D}/var/lib/osmocom
}

PACKAGES =+ "osmo-hnbgw libosmo-ranap"

INITSCRIPT_PACKAGES = "osmo-hnbgw"

# Do not start any of the services by default
SYSTEMD_AUTO_ENABLE = "disable"

CONFFILES_osmo-hnbgw = "${sysconfdir}/osmocom/osmo-hnbgw.cfg"
INITSCRIPT_NAME_osmo-hnbgw = "osmo-hnbgw"
INITSCRIPT_PARAMS_osmo-hnbgw = "defaults 30 30"
FILES_osmo-hnbgw = " ${bindir}/osmo-hnbgw \
		/var/lib/osmocom \
		${sysconfdir}/init.d/osmo-hnbgw \
		${sysconfdir}/osmocom/osmo-hnbgw.cfg \
		${systemd_unitdir}/system/osmo-hnbgw.service \
		"

# ?????
FILES_libosmo-ranap = " ${libdir}/libosmo-ranap "
