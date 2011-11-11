require ${PN}.inc

PV = "0.10.0+gitr${SRCPV}"
PR = "${INC_PR}.1"

SRCREV = "670ffe32900c9932f5fb1f3e836f77145bee94b7"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
