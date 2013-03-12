require ${PN}.inc

PV = "0.12.0+gitr${SRCPV}"
PR = "${INC_PR}.2"

SRCREV = "8b29180cad875b396288a22fb252e158fa2a060a"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
