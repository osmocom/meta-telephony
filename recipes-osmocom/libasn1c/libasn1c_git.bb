require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d36012fb029fd9914b4e8125c9c3186785940258"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.9.31+gitr${SRCPV}"
PR = "${INC_PR}.0"
