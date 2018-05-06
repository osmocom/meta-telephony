DESCRIPTION = "Osmocom GGSN implementation"
HOMEPAGE = "https://osmocom.org/projects/openggsn"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PV = "1.2.1+gitr${SRCPV}"
PR = "r0"

SRCREV = "ac07625086948281295e54dd295228153ecd5ff0"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://osmo-ggsn.init                             \
	   file://libgtp-queue_depth_32.patch		    \
          "
S = "${WORKDIR}/git"

DEPENDS = "libosmocore"

PACKAGES =+ " libgtp libgtp-dev libgtp-staticdev osmo-sgsnemu"
RDEPENDS_${PN} += "iptables kernel-module-ipt-masquerade kernel-module-tun"

inherit autotools update-rc.d pkgconfig systemd

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}/${sysconfdir}/osmocom/

	install -m 0776 ${WORKDIR}/osmo-ggsn.init ${D}${sysconfdir}/init.d/osmo-ggsn
	install -m 0644 ${S}/contrib/osmo-ggsn.service ${D}${systemd_system_unitdir}/
	install -m 0644 ${S}/doc/examples/osmo-ggsn.cfg ${D}${sysconfdir}/osmocom/
}

SYSTEMD_SERVICE_osmo-ggsn = "osmo-ggsn.service"

INITSCRIPT_PACKAGES = "osmo-ggsn"
INITSCRIPT_NAME_osmo-ggsn = "osmo-ggsn"
INITSCRIPT_PARAMS_osmo-ggsn = "defaults 29 29"

CONFFILES_osmo-ggsn = "${sysconfdir}/osmocom/osmo-ggsn.cfg"

FILES_libgtp = "${libdir}/*${SOLIBS}"
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la"
FILES_libgtp-staticdev = "${libdir}/*.a"

FILES_osmo-sgsnemu = "${bindir}/sgsnemu"
