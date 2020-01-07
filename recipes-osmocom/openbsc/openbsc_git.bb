require ${PN}.inc

PV = "1.3.2+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "3f457a3b79e2908664b40eab9ca8e70c44a54898"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
