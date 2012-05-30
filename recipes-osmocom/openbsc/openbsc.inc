DESCRITOPN = "OpenBSC a Free Software GSM BaseStationController"
DEPENDS = "libdbi libosmocore libosmo-sccp libosmo-abis openggsn"
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

RDEPENDS_osmo-nitb = "libdbd-sqlite3"

SRC_URI = "file://osmo-nitb.init \
	   file://osmo-bsc_mgcp.init \
	   file://osmo-bsc.init"
INC_PR = "r12.${META_TELEPHONY_OSMO_INC}"


EXTRA_OECONF += " --enable-nat --enable-osmo-bsc "

inherit autotools update-rc.d

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
	echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${sysconfdir}/osmocom
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/rc5.d
	install -m 0660 ${S}/doc/examples/osmo-nitb/nanobts/openbsc.cfg ${D}${sysconfdir}/osmocom/osmo-nitb.cfg
	install -m 0660 ${S}/doc/examples/osmo-bsc/osmo-bsc.cfg ${D}${sysconfdir}/osmocom/osmo-bsc.cfg
	install -m 0660 ${S}/doc/examples/osmo-bsc_mgcp/mgcp.cfg ${D}${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg
	install -m 0775 ${WORKDIR}/osmo-nitb.init ${D}${sysconfdir}/init.d/osmo-nitb
	install -m 0775 ${WORKDIR}/osmo-bsc_mgcp.init ${D}${sysconfdir}/init.d/osmo-bsc-mgcp
	install -m 0775 ${WORKDIR}/osmo-bsc.init ${D}${sysconfdir}/init.d/osmo-bsc

	install -d ${D}/var/lib/osmocom
}

PACKAGES =+ "osmo-bsc osmo-nitb osmo-gbproxy osmo-gbproxy-dbg osmo-sgsn ipaccess-utils osmo-bsc-mgcp osmo-bsc-nat"

INITSCRIPT_PACKAGES = "osmo-bsc osmo-bsc-mgcp osmo-nitb"

CONFFILES_osmo-bsc = "${sysconfdir}/osmocom/osmo-bsc.cfg"
INITSCRIPT_NAME_osmo-bsc = "osmo-bsc"
INITSCRIPT_PARAMS_osmo-bsc = "defaults 30 30"
FILES_osmo-bsc = " ${bindir}/osmo-bsc \
		${sysconfdir}/osmocom/osmo-bsc.cfg \
		${sysconfdir}/init.d/osmo-bsc"

CONFFILES_osmo-bsc-mgcp = "${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg"
INITSCRIPT_NAME_osmo-bsc-mgcp = "osmo-bsc-mgcp"
INITSCRIPT_PARAMS_osmo-bsc-mgcp = "defaults 30 30"
FILES_osmo-bsc-mgcp = " ${bindir}/osmo-bsc_mgcp \
		${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg \
		${sysconfdir}/init.d/osmo-bsc-mgcp"

CONFFILES_osmo-nitb = "${sysconfdir}/osmocom/osmo-nitb.cfg"
INITSCRIPT_NAME_osmo-nitb = "osmo-nitb"
INITSCRIPT_PARAMS_osmo-nitb = "defaults 30 30"
FILES_osmo-nitb = " ${bindir}/osmo-nitb \
		/var/lib/osmocom \
		${sysconfdir}/init.d/osmo-nitb \
		${sysconfdir}/osmocom/osmo-nitb.cfg"

FILES_osmo-sgsn = " ${bindir}/osmo-sgsn "
FILES_ipaccess-utils = " ${bindir}/ipaccess-find ${bindir}/ipaccess-config ${bindir}/ipaccess-proxy "
FILES_osmo-bsc-nat = " ${bindir}/osmo-bsc_nat "
FILES_osmo-gbproxy = " ${bindir}/osmo-gbproxy "
FILES_osmo-gbproxy-dbg = " ${bindir}/.debug/osmo-gbproxy "

