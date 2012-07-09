require ${PN}.inc

PV = "0.12.0+gitr${SRCPV}"
PR = "${INC_PR}.1"

SRCREV = "019f913ca383bda9256e273c06327041b1761330"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
