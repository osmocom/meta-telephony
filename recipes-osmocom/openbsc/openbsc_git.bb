require ${PN}.inc

PV = "0.15.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "5d69fa52cf1e679e391519dd841da1579d640087"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
