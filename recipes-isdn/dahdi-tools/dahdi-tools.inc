DESCRITOPN = "Utilities for the DAHDI Asterisk Linux kernel drivers"
DEPENDS = "dahdi-linux libnewt"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"

SRC_URI = "http://downloads.asterisk.org/pub/telephony/dahdi-tools/releases/dahdi-tools-${PV}.tar.gz"

INC_PR="r2"

LIC_FILES_CHKSUM = "file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a \
		    file://LICENSE.LGPL;md5=fb504b67c50331fc78734fed90fb0e09"

inherit autotools_stage pkgconfig

do_configure() {
	oe_runconf
}
