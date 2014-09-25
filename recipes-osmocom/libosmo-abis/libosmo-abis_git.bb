require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d9d1b5c19f40515cb7c660acda7265bbddbb73d6"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
