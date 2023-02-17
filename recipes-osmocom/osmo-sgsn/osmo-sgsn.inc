DESCRIPTION = "Osmocom SGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/osmosgsn"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "c-ares libosmocore libosmo-netif osmo-ggsn osmo-hlr"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    ${@bb.utils.filter('DISTRO_FEATURES', 'iu', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"
PACKAGECONFIG[iu] = "--enable-iu,--disable-iu,libasn1c libosmo-sccp osmo-iuh,"

# StateDirectory requires systemd >= v235, but poky pyro ships with v232 (SYS#6340):
do_install_append() {
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/osmo-sgsn.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/osmo-sgsn.service"
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/osmo-gtphub.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/osmo-gtphub.service"
}

PACKAGES =+ "osmo-gtphub-doc osmo-gtphub"
SYSTEMD_PACKAGES = "osmo-sgsn osmo-gtphub"
SYSTEMD_SERVICE_osmo-sgsn = "osmo-sgsn.service"
SYSTEMD_SERVICE_osmo-gtphub = "osmo-gtphub.service"

CONFFILES_osmo-sgsn = "${sysconfdir}/osmocom/osmo-sgsn.cfg"

FILES_osmo-gtphub = " \
		${bindir}/osmo-gtphub \
		${sysconfdir}/osmocom/osmo-gtphub.cfg \
		"
CONFFILES_osmo-gtphub = "${sysconfdir}/osmocom/osmo-gtphub.cfg"

FILES_osmo-gtphub-doc = " ${docdir}/osmo-sgsn/examples/osmo-gtphub "
