require ${PN}.inc

PV = "1.4.1+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "83fbbeb56c45d84321fa3218c8afd5b3644a2ca2"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
