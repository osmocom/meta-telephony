require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e58d33153dd2bed3629b9a09fd6add58f296bd6a"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.2"
