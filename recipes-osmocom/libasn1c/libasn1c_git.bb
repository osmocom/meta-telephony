require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "bd2173796d90db181c22034e4acbe391d2cb57ce"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.9.28+gitr${SRCPV}"
PR = "${INC_PR}.0"
