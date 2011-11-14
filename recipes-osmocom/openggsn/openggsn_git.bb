DESCRITOPN = "OpenGGSN a Free Software GGSN"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PV = "0.91+gitr${SRCPV}"
PR = "r10"

SRCREV = "fe5040967513616731d8151b22d26bdf74d65111"
SRC_URI = "git://ggsn.git.sourceforge.net/gitroot/ggsn/ggsn \
           file://openggsn.init                             \
          "
S = "${WORKDIR}/git"

PACKAGES =+ " libgtp libgtp-dev openggsn-sgsnemu"
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
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la ${libdir}/*.a"

FILES_openggsn-sgsnemu = "${bindir}/sgsnemu"
