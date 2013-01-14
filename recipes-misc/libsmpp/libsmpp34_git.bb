DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://sourceforge.net/projects/c-open-smpp-34/""
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

S = "${WORKDIR}/git"
SRCREV = "a18bad989696b5047fab20e579a6e5a886a4904f"
SRC_URI = "git://git.osmocom.org/libsmpp34.git;protocol=git"
PV = "1.10+gitr${SRCPV}"
PR = "0"

PARALLEL_MAKE = ""

inherit autotools_stage pkgconfig

PACKAGES =+ "${PN}-apps"
FILES_${PN}-apps = "${bindir}/*"

