DESCRIPTION = "Osmocom BSC implementation"
HOMEPAGE = "https://osmocom.org/projects/osmobsc"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "sqlite3 libpcap libosmocore libosmo-abis libosmo-sccp libosmo-netif osmo-mgw"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

PACKAGES =+ "meas-utils ipaccess-utils bs11-utils abisip-find"
SYSTEMD_PACKAGES = "osmo-bsc"
SYSTEMD_SERVICE_osmo-bsc = "osmo-bsc.service"

CONFFILES_osmo-bsc = "${sysconfdir}/osmocom/osmo-bsc.cfg"

FILES_abisip-find = "${bindir}/abisip-find"

FILES_bs11-utils = " \
		${bindir}/bs11_config \
		${bindir}/isdnsync \
		"

FILES_ipaccess-utils = " \
		${bindir}/ipaccess-find \
		${bindir}/ipaccess-config \
		${bindir}/ipaccess-proxy \
		"

FILES_meas-utils = " \
		${bindir}/osmo-meas-udp2db \
		${bindir}/osmo-meas-pcap2db \
		${bindir}/meas_json \
		"
