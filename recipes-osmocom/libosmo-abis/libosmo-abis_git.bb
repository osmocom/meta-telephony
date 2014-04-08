require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ecd0a36ce8d468985ec296214e3ecced8da487cc"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.2.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
