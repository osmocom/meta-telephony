DESCRIPTION = "Shell script to start, nice and respawn services"
HOMEPAGE = "http://openbsc.osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://osmo-service-respawn.sh"

RDEPENDS_${PN} = "bash"

do_install() {
	install -d ${D}${bindir}
	install -m 0775 ${WORKDIR}/osmo-service-respawn.sh ${D}${bindir}
}
