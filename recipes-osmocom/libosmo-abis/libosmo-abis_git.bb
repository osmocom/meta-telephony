require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "30249a15d51a15b498e87b78bd3fc8d684ffcf46"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
