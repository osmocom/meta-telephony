DESCRIPTION = "Osmocom MSC implementation"
HOMEPAGE = "https://osmocom.org/projects/osmomsc"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libdbi libosmocore libosmo-abis libosmo-sccp libosmo-netif osmo-mgw"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "smpp ${@bb.utils.filter('DISTRO_FEATURES', 'iu', d)}"
PACKAGECONFIG[iu] = "--enable-iu,--disable-iu,libasn1c osmo-iuh,"
PACKAGECONFIG[smpp] = "--enable-smpp,--disable-smpp,libsmpp34,"

RDEPENDS_${PN} = "libdbd-sqlite3"

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-msc/osmo-msc.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-msc.service ${D}${systemd_system_unitdir}/

	# osmo-bsc already provides these, see issue Osmocom #2522:
	rm -f ${D}${bindir}/.debug/*meas*
	rm -f ${D}${bindir}/*meas*
}

SYSTEMD_SERVICE_${PN} = "${PN}.service"
