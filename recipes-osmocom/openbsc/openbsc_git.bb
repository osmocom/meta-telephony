require ${PN}.inc

PV = "1.4.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "a1c1a313e574748bf802eccd93a18fba42a8aa3a"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
