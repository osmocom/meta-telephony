require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
