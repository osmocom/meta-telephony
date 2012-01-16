DESCRITOPN = "mISDNutils userspace library"
HOMEPAGE = "http://misdn.org"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"
PR = "r4"

SRC_URI = "git://git.misdn.eu/mISDNuser.git \
           file://misdn-ph-size.diff"
SRCREV = "fd246f6bbbf2f4692f507018bcd1a526fab16499"
S = "${WORKDIR}/git"

PACKAGES =+ "misdn-tools-dbg misdn-tools"

inherit autotools

FILES_misdn-tools = "${bindir} ${sbindir}"
FILES_misdn-tools-dbg = "${bindir}/.debug ${sbindir}/.debug"
RDEPENDS_misdn-tools-dbg = "${PN}-dbg"
