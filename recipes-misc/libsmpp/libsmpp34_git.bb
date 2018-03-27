DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://osmocom.org/projects/libsmpp34/"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

S = "${WORKDIR}/git"
SRCREV = "0cad3b4538710a91881ddbb80424c2d7c62de962"
SRC_URI = "git://git.osmocom.org/libsmpp34.git;protocol=git"
PV = "1.12.0+gitr${SRCPV}"
PR = "r0"

PARALLEL_MAKE = ""

inherit autotools pkgconfig

PACKAGES =+ "${PN}-apps"
FILES_${PN}-apps = "${bindir}/*"
