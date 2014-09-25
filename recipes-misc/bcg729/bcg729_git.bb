DESCRIPTION = "G729 codec library"
HOMEPAGE = "http://www.linphone.org/eng/documentation/dev/bcg729.html"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

SRC_URI = "git://git.linphone.org/bcg729.git"
SRCREV = "2e36a5d4bc6e992c654eee6b0a8db729da7b1d31"
PV = "0+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit autotools pkgconfig
