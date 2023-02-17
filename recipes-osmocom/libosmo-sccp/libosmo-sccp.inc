DESCRIPTION = "An utility library for Open Source Mobile Communications"
DEPENDS = "libosmocore libosmo-netif"
HOMEPAGE = "https://osmocom.org/projects/libosmo-sccp"
LICENSE = "AGPLv3"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

# we require the tests to link to the static libosmo-sigtran library to
# access symbols not starting with osmo_*
EXTRA_OECONF_remove = "--disable-static"

# StateDirectory requires systemd >= v235, but poky pyro ships with v232 (SYS#6340):
do_install_append() {
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/osmo-stp.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/osmo-stp.service"
}

PACKAGES =+ "osmo-stp"
SYSTEMD_PACKAGES = "osmo-stp"
SYSTEMD_SERVICE_osmo-stp = "osmo-stp.service"

FILES_osmo-stp = " \
		${bindir}/osmo-stp \
		${sysconfdir}/osmocom/osmo-stp.cfg \
		"
CONFFILES_osmo-stp = "${sysconfdir}/osmocom/osmo-stp.cfg"

ALLOW_EMPTY_libosmo-sccp = "1"
