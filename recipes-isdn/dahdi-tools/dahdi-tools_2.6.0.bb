DESCRITOPN = "Utilities for the DAHDI Asterisk Linux kernel drivers"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a \
    file://LICENSE.LGPL;md5=fb504b67c50331fc78734fed90fb0e09 \
"

DEPENDS = "dahdi-linux libnewt libpcap"

SRC_URI = "\
    http://downloads.asterisk.org/pub/telephony/dahdi-tools/releases/dahdi-tools-${PV}.tar.gz \
    file://perl_install.patch \
"

inherit autotools_stage pkgconfig perlnative cpan-base

export DAHDI_PERLLIBDIR="${PERLLIBDIRS}/${@get_perl_version(d)}"

do_configure() {
    oe_runconf
}

do_compile() {
    base_do_compile
    oe_runmake dahdi_pcap
}

do_install() {
    autotools_do_install
    install -m 755 ${S}/dahdi_pcap ${D}${sbindir}/
}

FILES_${PN} += "${datadir}/dahdi"

RDEPENDS_${PN} += "\
    perl perl-module-strict perl-module-file-basename perl-module-config \
    perl-module-warnings perl-module-getopt perl-module-getopt-std \
    perl-module-file perl-module-file-glob perl-module-xsloader \
    perl-module-dynaloader perl-module-carp perl-module-errno \
"
