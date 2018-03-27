require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "202022eaa9c36d1209cf024830b99d7d2463663e"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.9.28+gitr${SRCPV}"
PR = "${INC_PR}.0"
