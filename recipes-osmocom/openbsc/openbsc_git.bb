require ${PN}.inc

PV = "0.12.0+gitr${SRCPV}"
PR = "${INC_PR}.2"

SRCREV = "94c2b0578b4827e5535296477c3cd1d39d8f4814"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
