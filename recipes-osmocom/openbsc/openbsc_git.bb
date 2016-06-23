require ${PN}.inc

PV = "1.3.2+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "${AUTOREV}"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
