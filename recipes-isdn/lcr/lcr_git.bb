DESCRITOPN = "Linux Call Router"
DEPENDS = "libgsm libopencore-amr sofia-sip"
HOMEPAGE = "http://isdn.eversberg.eu/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=de9327a12ae1ccc94dade892a360f996"

PV = "1.14+gitr${SRCPV}"
PR = "r4"

SRCREV = "38fce218f8897d120aeba56e811ef7dada898c2c"
SRC_URI = "git://git.misdn.eu/lcr.git \
	   file://lcr-disable-gsmfr.diff \
	   file://0001-Fixed-compiler-warnings.patch \
           file://lcr.init             "
S = "${WORKDIR}/git"

EXTRA_OECONF = "--with-gsm-bs --without-asterisk --without-misdn --with-sip"

inherit autotools update-rc.d pkgconfig

PACKAGES =+ "${PN}-tones-de ${PN}-vbox-de \
             ${PN}-tones-en ${PN}-vbox-en"

CONFFILES_${PN} = "${sysconfdir}/lcr/options.conf"
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "lcr"
INITSCRIPT_PARAMS_${PN} = "defaults 30 30"

FILES_${PN}-tones-de = "/usr/share/lcr/tones_german"
FILES_${PN}-tones-en = "/usr/share/lcr/tones_american"
FILES_${PN}-vbox-de = "/usr/share/lcr/vbox_german"
FILES_${PN}-vbox-en = "/usr/share/lcr/vbox_english"


do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0775 ${WORKDIR}/lcr.init ${D}${sysconfdir}/init.d/lcr

	rm ${D}${sysconfdir}/lcr/routing.conf
	rm ${D}${sysconfdir}/lcr/interface.conf
	rm ${D}${sysconfdir}/lcr/directory.list
}
