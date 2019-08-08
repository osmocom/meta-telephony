require ${PN}.inc

PV = "1.3.1+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "bb414bf8b104e1b56e61bb804c75d30cda2a9e3c"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
