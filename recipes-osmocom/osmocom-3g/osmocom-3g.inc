DESCRIPTION = "OsmoMSC, OsmoSGSN, OsmoMGCP"
DEPENDS = "libdbi libosmocore libosmo-sccp libosmo-abis libosmo-netif openggsn libsmpp34 bcg729 libgsm libpcap c-ares libasn1c osmo-iuh"
HOMEPAGE = "http://osmocom.org/projects/osmomsc"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

RDEPENDS_osmo-msc = "libdbd-sqlite3"

SRC_URI = "file://osmo-msc.init \
	   file://osmo-bsc_mgcp.init \
	   file://osmo-sgsn.init"

INC_PR = "r1.${META_TELEPHONY_OSMO_INC}"


EXTRA_OECONF += " --enable-iu --enable-smpp --enable-mgcp-transcoding --with-g729"

inherit autotools update-rc.d pkgconfig

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
	echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -m 0660 ${S}/doc/examples/osmo-msc/osmo-msc.cfg ${D}${sysconfdir}/osmocom/osmo-msc.cfg
	install -m 0660 ${S}/doc/examples/osmo-bsc_mgcp/mgcp.cfg ${D}${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg
	install -m 0660 ${S}/doc/examples/osmo-sgsn/osmo-sgsn.cfg ${D}${sysconfdir}/osmocom/osmo-sgsn.cfg

	# Install sysv-init files
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0775 ${WORKDIR}/osmo-msc.init ${D}${sysconfdir}/init.d/osmo-msc
	install -m 0775 ${WORKDIR}/osmo-bsc_mgcp.init ${D}${sysconfdir}/init.d/osmo-bsc-mgcp
	install -m 0775 ${WORKDIR}/osmo-sgsn.init ${D}${sysconfdir}/init.d/osmo-sgsn

	# Install systemd files and enable on sysinit
	install -d ${D}${systemd_unitdir}/system
	install -m 0644 ${S}/contrib/systemd/osmo-msc.service ${D}${systemd_unitdir}/system/
	install -m 0644 ${S}/contrib/systemd/osmo-sgsn.service ${D}${systemd_unitdir}/system/
	install -m 0644 ${S}/contrib/systemd/osmo-bsc-mgcp.service ${D}${systemd_unitdir}/system/

	install -d ${D}/var/lib/osmocom
}

PACKAGES =+ "osmo-msc osmo-sgsn osmo-bsc-mgcp ipaccess-utils"

INITSCRIPT_PACKAGES = "osmo-msc osmo-sgsn osmo-bsc-mgcp"

# Do not start any of the services by default
SYSTEMD_AUTO_ENABLE = "disable"

CONFFILES_osmo-msc = "${sysconfdir}/osmocom/osmo-msc.cfg"
INITSCRIPT_NAME_osmo-msc = "osmo-msc"
INITSCRIPT_PARAMS_osmo-msc = "defaults 30 30"
FILES_osmo-msc = " ${bindir}/osmo-msc \
		/var/lib/osmocom \
		${sysconfdir}/init.d/osmo-msc \
		${sysconfdir}/osmocom/osmo-msc.cfg \
		${systemd_unitdir}/system/osmo-msc.service \
		"

CONFFILES_osmo-sgsn = "${sysconfdir}/osmocom/osmo-sgsn.cfg"
INITSCRIPT_NAME_osmo-sgsn = "osmo-sgsn"
INITSCRIPT_PARAMS_osmo-sgsn = "defaults 30 30"
FILES_osmo-sgsn = " ${bindir}/osmo-sgsn \
		${sysconfdir}/init.d/osmo-sgsn \
		${sysconfdir}/osmocom/osmo-sgsn.cfg \
		${systemd_unitdir}/system/osmo-sgsn.service \
		"

CONFFILES_osmo-bsc-mgcp = "${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg"
INITSCRIPT_NAME_osmo-bsc-mgcp = "osmo-bsc-mgcp"
INITSCRIPT_PARAMS_osmo-bsc-mgcp = "defaults 30 30"
FILES_osmo-bsc-mgcp = " ${bindir}/osmo-bsc_mgcp \
		${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg \
		${sysconfdir}/init.d/osmo-bsc-mgcp \
		${systemd_unitdir}/system/osmo-bsc-mgcp.service \
		"

FILES_ipaccess-utils = " ${bindir}/ipaccess-find ${bindir}/ipaccess-config ${bindir}/ipaccess-proxy "
