DESCRIPTION = "C Open SMPP library"
HOMEPAGE = "http://sourceforge.net/projects/c-open-smpp-34/""
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=fbc093901857fcd118f065f900982c24"
SECTION = "libs"
DEPENDS = "libxml2"

PR = "r2"

SRC_URI = "${SOURCEFORGE_MIRROR}/c-open-smpp-34/c-open-smpp-34/libsmpp34-1.10%20%28LGPL%29/libsmpp34-${PV}.tar.gz"
SRC_URI[md5sum] = "fbc428bffa12a2cbe449005c0378fa64"
SRC_URI[sha256sum] = "7c4d7e30f1a0c10a282f3360adf25c6681bcc578ddaffc6a7d790d1637305a1f"

PARALLEL_MAKE = ""

inherit autotools

PACKAGES =+ "${PN}-apps"
FILES_${PN}-apps = "${bindir}/*"


