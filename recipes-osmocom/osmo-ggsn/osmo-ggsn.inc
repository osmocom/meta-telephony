DESCRIPTION = "Osmocom GGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/openggsn"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

DEPENDS = "libosmocore"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

PACKAGES =+ " libgtp libgtp-dev libgtp-staticdev osmo-sgsnemu"
RDEPENDS_${PN} += "iptables"
RRECOMMENDS_${PN} += "kernel-module-ipt-masquerade kernel-module-tun"

inherit autotools pkgconfig systemd

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}/${sysconfdir}/osmocom/

	install -m 0644 ${S}/contrib/osmo-ggsn.service ${D}${systemd_system_unitdir}/
	install -m 0644 ${S}/doc/examples/osmo-ggsn.cfg ${D}${sysconfdir}/osmocom/
}

SYSTEMD_SERVICE_osmo-ggsn = "osmo-ggsn.service"

CONFFILES_osmo-ggsn = "${sysconfdir}/osmocom/osmo-ggsn.cfg"

FILES_libgtp = "${libdir}/*${SOLIBS}"
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la"
FILES_libgtp-staticdev = "${libdir}/*.a"

FILES_osmo-sgsnemu = "${bindir}/sgsnemu"
