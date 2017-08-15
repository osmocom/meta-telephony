DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://osmocom.org/projects/libsmpp34"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

PR = "r0"

SRC_URI = "git://git.osmocom.org/${PN}"
SRCREV = "6d47c170cccd8a72eae985c7ecffba3f07d3861a"
S = "${WORKDIR}/git"

PARALLEL_MAKE = ""

inherit autotools


