DESCRITOPN = "Utilities for the DAHDI Asterisk Linux kernel drivers"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a \
    file://LICENSE.LGPL;md5=fb504b67c50331fc78734fed90fb0e09 \
"

DEPENDS = "dahdi-linux libnewt libusb"

SRC_URI = "\
    http://downloads.asterisk.org/pub/telephony/dahdi-tools/releases/dahdi-tools-${PV}.tar.gz \
    file://0001-Set-perllibdir.patch \
    file://0002-Use-sh-not-bash.patch \
    file://0003-Remove-Werror-from-Makefile.patch \
    file://dahdi.init.d \
"

SRC_URI[md5sum] = "6928cdf6f7710299ecbcacbac20d5c92"
SRC_URI[sha256sum] = "9e904815dedab231084c542d2d7d5dcc832ebec4b5d5d999a5d757df8b2d571a"

S = "${WORKDIR}/${PN}-${PV}"

inherit autotools-brokensep pkgconfig perlnative cpan-base update-rc.d

export DAHDI_PERLLIBDIR="${PERLLIBDIRS}/${@get_perl_version(d)}"

INITSCRIPT_NAME = "dahdi"
INITSCRIPT_PARAMS = "defaults"

do_install_append(){
    oe_runmake DESTDIR=${D} config
    install -Dm 0755 ${WORKDIR}/dahdi.init.d ${D}${sysconfdir}/init.d/dahdi
    chown -R root:root ${D}${datadir}/dahdi/
}

FILES_${PN} += "${datadir}/dahdi"

RDEPENDS_${PN} += "\
    perl perl-module-strict perl-module-file-basename perl-module-config \
    perl-module-warnings perl-module-getopt-std perl-module-file-glob \
    perl-module-xsloader perl-module-dynaloader perl-module-carp \
    perl-module-errno perl-module-file-basename dahdi-linux \
"
