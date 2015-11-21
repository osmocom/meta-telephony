require ${PN}.inc

PV = "0.15.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.1"

SRCREV = "3c820ee532021a89aca96d1a52ecb463ccc07d03"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
