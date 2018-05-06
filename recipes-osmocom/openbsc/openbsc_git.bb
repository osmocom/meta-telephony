require ${PN}.inc

PV = "1.1.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "cc69659217d19af5635638a0fbd4f0702f79bac4"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
