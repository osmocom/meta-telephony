DESCRIPTION = "Osmocom SGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/osmosgsn"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "c-ares libosmocore libosmo-netif osmo-ggsn"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'iu', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"
PACKAGECONFIG[iu] = "--enable-iu,--disable-iu,libasn1c libosmo-sccp osmo-iuh,"

PACKAGES =+ "osmo-gbproxy-doc osmo-gtphub-doc osmo-gbproxy osmo-gtphub"
SYSTEMD_PACKAGES = "osmo-sgsn osmo-gbproxy osmo-gtphub"
SYSTEMD_SERVICE_osmo-sgsn = "osmo-sgsn.service"
SYSTEMD_SERVICE_osmo-gbproxy = "osmo-gbproxy.service"
SYSTEMD_SERVICE_osmo-gtphub = "osmo-gtphub.service"

CONFFILES_osmo-sgsn = "${sysconfdir}/osmocom/osmo-sgsn.cfg"

FILES_osmo-gbproxy = " \
		${bindir}/osmo-gbproxy \
		${sysconfdir}/osmocom/osmo-gbproxy.cfg \
		"
CONFFILES_osmo-gbproxy = "${sysconfdir}/osmocom/osmo-gbproxy.cfg"

FILES_osmo-gtphub = " \
		${bindir}/osmo-gtphub \
		${sysconfdir}/osmocom/osmo-gtphub.cfg \
		"
CONFFILES_osmo-gtphub = "${sysconfdir}/osmocom/osmo-gtphub.cfg"

FILES_osmo-gbproxy-doc = " ${docdir}/osmo-sgsn/examples/osmo-gbproxy "
FILES_osmo-gtphub-doc = " ${docdir}/osmo-sgsn/examples/osmo-gtphub "
