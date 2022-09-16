require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libosmo-sccp.git;protocol=https"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
