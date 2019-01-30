require ${PN}.inc

PV = "1.2.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "ed8815e723b41e9800f14c67bccd34e51a06beb6"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
