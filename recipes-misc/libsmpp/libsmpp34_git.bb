DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://osmocom.org/projects/libsmpp34/"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

S = "${WORKDIR}/git"
SRCREV = "d2704da4cb3efdf241d2cde037688badaef53f9a"
SRC_URI = "git://git.osmocom.org/libsmpp34.git;protocol=git"
PV = "1.14.0+gitr${SRCPV}"
PR = "r0"

PARALLEL_MAKE = ""

inherit autotools pkgconfig

PACKAGES =+ "${PN}-apps"
FILES_${PN}-apps = "${bindir}/*"
