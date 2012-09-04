DESCRITOPN = "OpenGGSN a Free Software GGSN"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PV = "0.91+gitr${SRCPV}"
PR = "r11"

SRCREV = "95848bafcef145d776d70a73f7bdc3fe37e85724"
SRC_URI = "git://ggsn.git.sourceforge.net/gitroot/ggsn/ggsn \
           file://openggsn.init                             \
          "
S = "${WORKDIR}/git"

PACKAGES =+ " libgtp libgtp-dev libgtp-staticdev openggsn-sgsnemu"
RDEPENDS_${PN} += "kernel-module-tun"

inherit autotools update-rc.d

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0776 ${WORKDIR}/openggsn.init ${D}${sysconfdir}/init.d/openggsn
}

INITSCRIPT_PACKAGES = "openggsn"

INITSCRIPT_NAME_openggsn = "openggsn"
INITSCRIPT_PARAMS_openggsn = "defaults 29 29"
RDEPENDS_${PN} += "iptables kernel-module-ipt-masquerade"

FILES_libgtp = "${libdir}/*${SOLIBS}"
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la"
FILES_libgtp-staticdev = "${libdir}/*.a"

FILES_openggsn-sgsnemu = "${bindir}/sgsnemu"
