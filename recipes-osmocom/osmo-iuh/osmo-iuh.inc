DESCRIPTION = "Osmocom Iuh and HNB-GW implementation"
HOMEPAGE = "https://osmocom.org/projects/osmohnbgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif libosmo-sccp libasn1c"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-hnbgw.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-hnbgw.service ${D}${systemd_system_unitdir}/
}

PACKAGES =+ "libosmo-ranap libosmo-ranap-dev osmo-hnbgw"
SYSTEMD_PACKAGES = "osmo-hnbgw"
SYSTEMD_SERVICE_osmo-hnbgw = "osmo-hnbgw.service"

FILES_libosmo-ranap = " \
		${libdir}/libosmo-ranap${SOLIBS} \
		"

FILES_libosmo-ranap-dev = " \
		${includedir}/osmocom/ranap \
		${libdir}/pkgconfig/libosmo-ranap.pc \
		${libdir}/libosmo-ranap${SOLIBSDEV} \
		"

FILES_osmo-hnbgw = " \
		${bindir}/osmo-hnbgw \
		${sysconfdir}/osmocom/osmo-hnbgw.cfg \
		"

ALLOW_EMPTY_${PN} = "1"
