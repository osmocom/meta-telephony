DESCRITOPN = "Linux Call Router"
DEPENDS = "misdn-utils asterisk libgsm"
HOMEPAGE = "http://isdn.eversberg.eu/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=de9327a12ae1ccc94dade892a360f996"

PV = "1.10+gitr${SRCPV}"
PR = "r16"

SRCREV = "cd2834a10ceb14f8d2e70334a89b531119b954d4"
SRC_URI = "git://git.misdn.eu/lcr.git \
           file://lcr.init             "
S = "${WORKDIR}/git"

EXTRA_OECONF = "--with-gsm-bs --with-asterisk"

RDEPENDS_${PN} += "kernel-module-misdn-l1loop kernel-module-misdn-dsp"

inherit autotools update-rc.d

PACKAGES =+ "${PN}-tones-de ${PN}-vbox-de \
             ${PN}-tones-en ${PN}-vbox-en "

FILES_${PN} += "/usr/local ${libdir}/asterisk/modules"
FILES_${PN}-dbg += "${libdir}/asterisk/modules/.debug"
CONFFILES_${PN} = "/usr/local/lcr/options.conf"
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "lcr"
INITSCRIPT_PARAMS_${PN} = "defaults 30 30"

FILES_${PN}-tones-de = "/usr/local/lcr/tones_german"
FILES_${PN}-tones-en = "/usr/local/lcr/tones_american"
FILES_${PN}-vbox-de = "/usr/local/lcr/vbox_german"
FILES_${PN}-vbox-en = "/usr/local/lcr/vbox_english"


do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0775 ${WORKDIR}/lcr.init ${D}${sysconfdir}/init.d/lcr

	rm ${D}/usr/local/lcr/routing.conf
	rm ${D}/usr/local/lcr/interface.conf
}
