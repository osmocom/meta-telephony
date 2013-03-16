DESCRIPTION = "Shell script to start, nice and respawn services"
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = "file://osmo-service-respawn.sh"

RDEPENDS_${PN} = "bash"

do_install() {
	install -d ${D}${bindir}
	install -m 0775 ${WORKDIR}/osmo-service-respawn.sh ${D}${bindir}
}
