DESCRITOPN = "Linux Call Router"
DEPENDS = "asterisk libgsm libopencore-amr sofia-sip"
HOMEPAGE = "http://isdn.eversberg.eu/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=de9327a12ae1ccc94dade892a360f996"

PV = "1.13+gitr${SRCPV}"
PR = "r2"

SRCREV = "f3b94bf3a9599359805eaf20f3b036272c7af522"
SRC_URI = "git://git.misdn.eu/lcr.git \
	   file://lcr-disable-gsmfr.diff \
	   file://lcr-no_amr.diff \
           file://lcr.init             "
S = "${WORKDIR}/git"

EXTRA_OECONF = "--with-gsm-bs --with-asterisk --without-misdn --with-sip"

inherit autotools update-rc.d

PACKAGES =+ "${PN}-tones-de ${PN}-vbox-de \
             ${PN}-tones-en ${PN}-vbox-en \
	     ${PN}-asterisk"

CONFFILES_${PN} = "${sysconfdir}/lcr/options.conf"
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "lcr"
INITSCRIPT_PARAMS_${PN} = "defaults 30 30"

FILES_${PN}-tones-de = "/usr/share/lcr/tones_german"
FILES_${PN}-tones-en = "/usr/share/lcr/tones_american"
FILES_${PN}-vbox-de = "/usr/share/lcr/vbox_german"
FILES_${PN}-vbox-en = "/usr/share/lcr/vbox_english"
FILES_${PN}-asterisk = "/usr/lib/asterisk/modules/chan_lcr.so"


do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0775 ${WORKDIR}/lcr.init ${D}${sysconfdir}/init.d/lcr

	rm ${D}${sysconfdir}/lcr/routing.conf
	rm ${D}${sysconfdir}/lcr/interface.conf
	rm ${D}${sysconfdir}/lcr/directory.list
}
