DESCRITOPN = "Utilities for the DAHDI Asterisk Linux kernel drivers"
DEPENDS = "dahdi-linux libnewt libpcap"
RDEPENDS += "perl perl-module-strict perl-module-file-basename perl-module-config \
             perl-module-warnings perl-module-getopt perl-module-getopt-std \
             perl-module-file perl-module-file-glob perl-module-xsloader \
             perl-module-dynaloader perl-module-carp perl-module-errno"

HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"

SRC_URI = "http://downloads.asterisk.org/pub/telephony/dahdi-tools/releases/dahdi-tools-${PV}.tar.gz \
           file://perl_install.patch "

INC_PR="r18"

LIC_FILES_CHKSUM = "file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a \
		    file://LICENSE.LGPL;md5=fb504b67c50331fc78734fed90fb0e09"

FILES_${PN} += "${datadir}/dahdi"

inherit autotools_stage pkgconfig perlnative cpan-base

do_configure() {
	oe_runconf
}

do_compile() {
	base_do_compile
	oe_runmake dahdi_pcap
}

export DAHDI_PERLLIBDIR="${PERLLIBDIRS}/${@get_perl_version(d)}"
do_install() {
	autotools_do_install
	install -m 755 ${S}/dahdi_pcap ${D}${sbindir}/
}
