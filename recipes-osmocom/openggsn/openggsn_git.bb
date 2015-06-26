DESCRITOPN = "OpenGGSN a Free Software GGSN"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=8ca43cbc842c2336e835926c2166c28b"
PV = "0.91+gitr${SRCPV}"
PR = "r14"

SRCREV = "b07d07072e70ac4f920be9dfdf45615193b4ec2d"
SRC_URI = "git://git.osmocom.org/openggsn                   \
           file://openggsn.init                             \
	   file://libgtp-queue_depth_32.patch		    \
          "
S = "${WORKDIR}/git"

DEPENDS = "libosmocore"

PACKAGES =+ " libgtp libgtp-dev libgtp-staticdev openggsn-sgsnemu"
RDEPENDS_${PN} += "kernel-module-tun"

inherit autotools update-rc.d pkgconfig

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${systemd_unitdir}/system

	install -m 0776 ${WORKDIR}/openggsn.init ${D}${sysconfdir}/init.d/openggsn
	install -m 0644 ${S}/contrib/openggsn.service ${D}${systemd_unitdir}/system/
}

INITSCRIPT_PACKAGES = "openggsn"

INITSCRIPT_NAME_openggsn = "openggsn"
INITSCRIPT_PARAMS_openggsn = "defaults 29 29"
RDEPENDS_${PN} += "iptables kernel-module-ipt-masquerade"

FILES_libgtp = "${libdir}/*${SOLIBS}"
FILES_libgtp-dev = "${includedir} ${libdir}/lib*${SOLIBSDEV} ${libdir}/*.la"
FILES_libgtp-staticdev = "${libdir}/*.a"

FILES_openggsn-sgsnemu = "${bindir}/sgsnemu"
FILES_${PN} += "${systemd_unitdir}/system/*"
