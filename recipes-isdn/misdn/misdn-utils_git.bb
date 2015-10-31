DESCRITOPN = "mISDNutils userspace library"
HOMEPAGE = "http://misdn.org"
LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=55ca817ccb7d5b5b66355690e9abc605"

SRC_URI = "\
    git://git.misdn.eu/mISDNuser.git;branch=socket \
    file://0001-mbuffer-data-size.patch \
"
# Release v2.0.19
SRCREV = "3638cf36df506b96015e1f37ce3bb36ec94a01fb"

S = "${WORKDIR}/git"

inherit autotools

PACKAGES =+ "misdn-tools-dbg misdn-tools"

FILES_misdn-tools = "${bindir} ${sbindir}"
FILES_misdn-tools-dbg = "${bindir}/.debug ${sbindir}/.debug"

RDEPENDS_misdn-tools-dbg = "${PN}-dbg"
