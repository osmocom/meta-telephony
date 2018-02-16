DESCRIPTION = "Osmo SIP Connector"
HOMEPAGE = "https://osmocom.org/projects/osmo-sip-conector"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=ccdfc45f78d625db70e70ede679d5ce3"

DEPENDS = "sofia-sip libosmocore"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-sip-connector.cfg ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/contrib/systemd/osmo-sip-connector.service ${D}${systemd_system_unitdir}/
}
SYSTEMD_SERVICE_${PN} = "${PN}.service"
CONFFILES_osmo-sip-connector = "${sysconfdir}/osmocom/osmo-sip-connector.cfg"
