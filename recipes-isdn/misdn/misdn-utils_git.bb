DESCRITOPN = "mISDNutils userspace library"
HOMEPAGE = "http://misdn.org"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"
PR = "r3"

SRC_URI = "git://git.misdn.org/mISDNuser.git \
           file://misdn-ph-size.diff"
SRCREV = "609658c19630c01f82cbfb5687fc70a356fc6db5"
S = "${WORKDIR}/git"

PACKAGES =+ "misdn-tools-dbg misdn-tools"

inherit autotools

FILES_misdn-tools = "${bindir} ${sbindir}"
FILES_misdn-tools-dbg = "${bindir}/.debug ${sbindir}/.debug"
RDEPENDS_misdn-tools-dbg = "${PN}-dbg"
