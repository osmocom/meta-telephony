require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libosmo-abis.git;protocol=https"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
