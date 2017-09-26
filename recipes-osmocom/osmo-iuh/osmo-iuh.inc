DESCRIPTION = "Osmocom Iuh and HNB-GW implementation"
HOMEPAGE = "https://osmocom.org/projects/osmohnbgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif libosmo-sccp libasn1c"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-hnbgw.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-hnbgw.service ${D}${systemd_system_unitdir}/
}

SYSTEMD_SERVICE_${PN} = "osmo-hnbgw.service"
