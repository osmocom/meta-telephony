DESCRIPTION = "Osmocom SGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/osmosgsn"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "c-ares libpcap libasn1c libosmocore libosmo-netif libosmo-sccp osmo-iuh osmo-ggsn"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

EXTRA_OECONF += "--enable-iu"

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-sgsn/osmo-sgsn.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/doc/examples/osmo-gbproxy/osmo-gbproxy.cfg ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/contrib/systemd/osmo-sgsn.service ${D}${systemd_system_unitdir}/
	install -m 0644 ${S}/contrib/systemd/osmo-gbproxy.service ${D}${systemd_system_unitdir}/
}

PACKAGES =+ "osmo-gbproxy-doc osmo-gtphub-doc osmo-gbproxy osmo-gtphub"
SYSTEMD_PACKAGES = "osmo-sgsn osmo-gbproxy"
SYSTEMD_SERVICE_osmo-sgsn = "osmo-sgsn.service"
SYSTEMD_SERVICE_osmo-gbproxy = "osmo-gbproxy.service"

FILES_osmo-gbproxy = " \
		${bindir}/osmo-gbproxy \
		${sysconfdir}/osmocom/osmo-gbproxy.cfg \
		"

FILES_osmo-gtphub = " \
		${bindir}/osmo-gtphub \
		${sysconfdir}/osmocom/osmo-gtphub.cfg \
		"

FILES_osmo-gbproxy-doc = " ${docdir}/osmo-sgsn/examples/osmo-gbproxy "
FILES_osmo-gtphub-doc = " ${docdir}/osmo-sgsn/examples/osmo-gtphub "