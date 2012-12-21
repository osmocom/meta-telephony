require ${PN}.inc

PV = "0.12.0+gitr${SRCPV}"
PR = "${INC_PR}.2"

SRCREV = "25b70cea9d9521b081ea0cc524f5d157a1b89baf"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
