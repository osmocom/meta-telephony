require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=https"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
