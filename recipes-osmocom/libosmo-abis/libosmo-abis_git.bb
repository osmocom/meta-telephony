require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "176a1fbab6ae45eb1c60e3d8b263b0765759e1da"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
