require ${PN}.inc

PV = "1.0.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "c6382b5e0b4790d15681e89f704465160b9aef1d"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
