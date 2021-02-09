DESCRIPTION = "Osmocom's Gb interface aggregation/conversion proxy"
HOMEPAGE = "https://osmocom.org/projects/osmo-gbproxy"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

SYSTEMD_SERVICE_osmo-gbproxy = "osmo-gbproxy.service"

CONFFILES_osmo-gbproxy = "${sysconfdir}/osmocom/osmo-gbproxy.cfg"
