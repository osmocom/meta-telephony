require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2.3.0"
SRC_URI = "git://gerrit.osmocom.org/libosmo-sigtran.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
