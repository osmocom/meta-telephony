DESCRIPTION = "OpenBSC a Free Software GSM BaseStationController"
DEPENDS = "libdbi libosmocore libosmo-sccp libosmo-abis libosmo-netif osmo-ggsn libsmpp34 bcg729 libgsm libpcap"
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

RDEPENDS_osmo-nitb = "libdbd-sqlite3"

INC_PR = "r4.${META_TELEPHONY_OSMO_INC}"

EXTRA_OECONF += "--enable-nat --enable-osmo-bsc --enable-smpp --enable-mgcp-transcoding --with-g729"

inherit autotools systemd pkgconfig

do_install_append() {
	install -d ${D}/var/lib/osmocom
}

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

PACKAGES =+ "osmo-bsc-nat osmo-bsc-sccplite osmo-nitb osmo-bsc-mgcp"
SYSTEMD_PACKAGES = "osmo-bsc-nat osmo-bsc-sccplite osmo-nitb osmo-bsc-mgcp"

CONFFILES_osmo-bsc-sccplite = "${sysconfdir}/osmocom/osmo-bsc-sccplite.cfg"
SYSTEMD_SERVICE_osmo-bsc-sccplite = "osmo-bsc-sccplite.service"
FILES_osmo-bsc-sccplite = " ${bindir}/osmo-bsc-sccplite \
		${sysconfdir}/osmocom/osmo-bsc-sccplite.cfg \
		"

CONFFILES_osmo-nitb = "${sysconfdir}/osmocom/osmo-nitb.cfg"
SYSTEMD_SERVICE_osmo-nitb = "osmo-nitb.service"
FILES_osmo-nitb = " ${bindir}/osmo-nitb \
		/var/lib/osmocom \
		${sysconfdir}/osmocom/osmo-nitb.cfg \
		"

CONFFILES_osmo-bsc-nat = "${sysconfdir}/osmocom/osmo-bsc_nat.cfg"
SYSTEMD_SERVICE_osmo-bsc-nat = "osmo-bsc-nat.service"
FILES_osmo-bsc-nat = " \
		${bindir}/osmo-bsc_nat \
		${sysconfdir}/osmocom/osmo-bsc_nat.cfg \
		"

CONFFILES_osmo-bsc-mgcp = "${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg"
SYSTEMD_SERVICE_osmo-bsc-mgcp = "osmo-bsc-mgcp.service"
FILES_osmo-bsc-mgcp = " \
		${bindir}/osmo-bsc_mgcp \
		${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg \
		"
