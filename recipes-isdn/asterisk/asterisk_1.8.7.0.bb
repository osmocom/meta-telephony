# Copyright (C) 2007-2008, Stelios Koroneos - Digital OPSiS, All Rights Reserved
# Copyright (C) 2011, sysmocom - systems for mobile communications GmbH
# Released under the MIT license (see packages/COPYING)
DESCRITOPN = "asterisk PBX"
DEPENDS = "openssl ncurses"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3c6764ffcbe996d1d8f919b393ccdd67"

PR = "r3"

SRC_URI = "http://downloads.asterisk.org/pub/telephony/asterisk/releases/asterisk-${PV}.tar.gz \
           file://modules.conf            \
           file://asterisk.init"

EXTRA_OECONF = " \
        --without-curses \
        --with-sm=internal \
        --without-gtk \
        --without-gtk2 \
        --without-isdnnet \
        --without-kde \
        --without-misdn \
        --without-nbs \
        --with-ncurses \
        --without-netsnmp \
        --without-newt \
        --without-odbc \
        --without-ogg \
        --without-osptk \
        --without-popt \
        --without-pri \
        --without-qt \
        --without-radius \
        --without-sdl \
        --without-spandsp \
        --without-suppserv \
        --without-tds \
        --without-termcap \
        --without-tinfo \
        --without-vorbis \
        --without-vpb \
        --without-postgres \
        --without-openais \
        --without-lua \
        --disable-xmldoc"

inherit autotools update-rc.d

FILES_${PN}-dbg += "${libdir}/asterisk/modules/.debug"

do_configure_prepend() {
        # Due to menuselect below we want to save off these configures
        mv ${S}/menuselect/configure ${S}/menuselect/configure.SAVE
        mv ${S}/menuselect/mxml/configure ${S}/menuselect/mxml/configure.SAVE
        mv ${S}/main/editline/configure ${S}/main/editline/configure.SAVE
}

do_configure_append() {
        # Put this back
        mv ${S}/menuselect/configure.SAVE ${S}/menuselect/configure
        mv ${S}/menuselect/mxml/configure.SAVE ${S}/menuselect/mxml/configure
        mv ${S}/main/editline/configure.SAVE ${S}/main/editline/configure
}

INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME_${PN} = "asterisk"
INITSCRIPT_PARAMS_${PN} = "defaults 29 29"

PACKAGES =+ "${PN}-moh"

DESCRIPTION_${PN}-moh = "Asterisk MusicOnHold sound"
FILES_${PN}-moh = "${localstatedir}/lib/${PN}/moh"


do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -d ${D}${sysconfdir}/asterisk

	install -m 0775 ${WORKDIR}/asterisk.init   ${D}${sysconfdir}/init.d/asterisk
	install -m 0660 ${WORKDIR}/modules.conf    ${D}${sysconfdir}/asterisk/
}
