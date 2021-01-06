require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f3ccbecb6f802ccd98d154dc7ba7d552e298b2ea"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "1.0.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
