require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libosmo-sigtran.git;protocol=https"
PV = "2.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
