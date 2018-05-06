DESCRIPTION = "An utility library for Open Source Mobile Communications"
DEPENDS = "libosmocore libosmo-netif"
HOMEPAGE = "https://osmocom.org/projects/libosmo-sccp"
LICENSE = "AGPLv3"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig systemd

# we require the tests to link to the static libosmo-sigtran library to
# access symbols not starting with osmo_*
EXTRA_OECONF_remove = "--disable-static"

PACKAGES =+ "osmo-stp"
SYSTEMD_PACKAGES = "osmo-stp"
SYSTEMD_SERVICE_osmo-stp = "osmo-stp.service"

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-stp.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-stp.service ${D}${systemd_system_unitdir}/
}

FILES_osmo-stp = " \
		${bindir}/osmo-stp \
		${sysconfdir}/osmocom/osmo-stp.cfg \
		"
CONFFILES_osmo-stp = "${sysconfdir}/osmocom/osmo-stp.cfg"

ALLOW_EMPTY_libosmo-sccp = "1"
