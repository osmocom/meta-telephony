DESCRIPTION = "OpenBSC a Free Software GSM BaseStationController"
DEPENDS = "libdbi libosmocore libosmo-sccp libosmo-abis libosmo-netif osmo-ggsn libsmpp34 bcg729 libgsm libpcap"
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

RDEPENDS_osmo-nitb = "libdbd-sqlite3"

SRC_URI = "file://osmo-nitb.init \
	   file://osmo-bsc-sccplite.init \
	   file://osmo-bsc-sccplite.service \
	   "

INC_PR = "r25.${META_TELEPHONY_OSMO_INC}"


EXTRA_OECONF += "--enable-osmo-bsc --enable-smpp --enable-mgcp-transcoding --with-g729"

inherit autotools update-rc.d pkgconfig

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
	echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -m 0660 ${S}/doc/examples/osmo-nitb/nanobts/openbsc.cfg ${D}${sysconfdir}/osmocom/osmo-nitb.cfg
	install -m 0660 ${S}/doc/examples/osmo-bsc-sccplite/osmo-bsc-sccplite.cfg ${D}${sysconfdir}/osmocom/osmo-bsc-sccplite.cfg

	# Install sysv-init files
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0775 ${WORKDIR}/osmo-nitb.init ${D}${sysconfdir}/init.d/osmo-nitb
	install -m 0775 ${WORKDIR}/osmo-bsc-sccplite.init ${D}${sysconfdir}/init.d/osmo-bsc-sccplite

	# Install systemd files and enable on sysinit
	install -d ${D}${systemd_system_unitdir}/
	install -m 0644 ${S}/contrib/systemd/osmo-nitb.service ${D}${systemd_system_unitdir}/
	install -m 0644 ${WORKDIR}/osmo-bsc-sccplite.service ${D}${systemd_system_unitdir}/

	install -d ${D}/var/lib/osmocom

}

PACKAGES =+ "osmo-bsc-sccplite osmo-nitb"

INITSCRIPT_PACKAGES = "osmo-bsc-sccplite osmo-nitb"

# Do not start any of the services by default
SYSTEMD_AUTO_ENABLE = "disable"

CONFFILES_osmo-bsc-sccplite = "${sysconfdir}/osmocom/osmo-bsc-sccplite.cfg"
INITSCRIPT_NAME_osmo-bsc-sccplite = "osmo-bsc-sccplite"
INITSCRIPT_PARAMS_osmo-bsc-sccplite = "defaults 30 30"
FILES_osmo-bsc-sccplite = " ${bindir}/osmo-bsc-sccplite \
		${sysconfdir}/osmocom/osmo-bsc-sccplite.cfg \
		${sysconfdir}/init.d/osmo-bsc-sccplite \
		${systemd_system_unitdir}/osmo-bsc-sccplite.service \
		"

CONFFILES_osmo-nitb = "${sysconfdir}/osmocom/osmo-nitb.cfg"
INITSCRIPT_NAME_osmo-nitb = "osmo-nitb"
INITSCRIPT_PARAMS_osmo-nitb = "defaults 30 30"
FILES_osmo-nitb = " ${bindir}/osmo-nitb \
		/var/lib/osmocom \
		${sysconfdir}/init.d/osmo-nitb \
		${sysconfdir}/osmocom/osmo-nitb.cfg \
		${systemd_unitdir}/system/osmo-nitb.service \
		"
