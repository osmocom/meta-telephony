require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2.0.0"
SRC_URI = "git://gerrit.osmocom.org/libosmo-sigtran.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "2.0.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
