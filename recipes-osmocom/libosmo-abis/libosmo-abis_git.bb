require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2.2.0"
SRC_URI = "git://gerrit.osmocom.org/libosmo-abis.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
