require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.3"

SRCREV = "ebe55aa95a11bff56779e1354cf8f6640a1a7a9e"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
