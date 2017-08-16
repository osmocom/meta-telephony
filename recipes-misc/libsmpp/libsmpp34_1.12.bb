DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://osmocom.org/projects/libsmpp34/"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

S = "${WORKDIR}/git"
SRCREV = "6d47c170cccd8a72eae985c7ecffba3f07d3861a"
SRC_URI = "git://git.osmocom.org/libsmpp34.git;protocol=git"
PR = "r1"

PARALLEL_MAKE = ""

inherit autotools pkgconfig

PACKAGES =+ "${PN}-apps"
FILES_${PN}-apps = "${bindir}/*"

