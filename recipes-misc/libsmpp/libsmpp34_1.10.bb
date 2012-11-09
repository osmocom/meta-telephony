DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://sourceforge.net/projects/c-open-smpp-34/""
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

PR = "r3"

SRC_URI = "${SOURCEFORGE_MIRROR}/c-open-smpp-34/c-open-smpp-34/libsmpp34-1.10%20%28LGPL%29/libsmpp34-${PV}.tar.gz"
SRC_URI = "git://git.osmocom.org/${PN}"
SRCREV = "9288d59cfdc452fa3a92728149537372ee5c6c56"
S = "${WORKDIR}/git"

PARALLEL_MAKE = ""

inherit autotools


