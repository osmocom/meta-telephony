DESCRIPTION = "Osmocom MSC implementation"
HOMEPAGE = "https://osmocom.org/projects/osmomsc"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libdbi libosmocore libosmo-abis libosmo-sccp libosmo-netif osmo-mgw osmo-hlr"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    smpp \
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'iu', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"
PACKAGECONFIG[iu] = "--enable-iu,--disable-iu,libasn1c osmo-iuh,"
PACKAGECONFIG[smpp] = "--enable-smpp,--disable-smpp,libsmpp34,"

RDEPENDS_${PN} = "libdbd-sqlite3"

SYSTEMD_SERVICE_${PN} = "${PN}.service"
CONFFILES_osmo-msc = "${sysconfdir}/osmocom/osmo-msc.cfg"
