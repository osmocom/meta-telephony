DESCRIPTION = "Osmocom GGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/openggsn"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"

DEPENDS = "libosmocore"

INC_PR="r3.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

# StateDirectory requires systemd >= v235, but poky pyro ships with v232 (SYS#6340):
do_install_append() {
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
}

PACKAGES =+ " libgtp libgtp-dev libgtp-staticdev osmo-sgsnemu"
RDEPENDS_${PN} += "iptables"
RRECOMMENDS_${PN} += "kernel-module-ipt-masquerade kernel-module-tun"

SYSTEMD_SERVICE_osmo-ggsn = "osmo-ggsn.service"

CONFFILES_osmo-ggsn = "${sysconfdir}/osmocom/osmo-ggsn.cfg"

FILES_libgtp = "${libdir}/*${SOLIBS}"
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la"
FILES_libgtp-staticdev = "${libdir}/*.a"

FILES_osmo-sgsnemu = "${bindir}/sgsnemu"
