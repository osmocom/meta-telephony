require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f1febda826b87ac78a4cc33504159cc7821e3190"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.2"
