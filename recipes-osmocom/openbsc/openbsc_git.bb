require ${PN}.inc

PV = "1.4.2+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "${AUTOREV}"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
