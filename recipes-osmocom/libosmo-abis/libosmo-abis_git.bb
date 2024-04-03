require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.5.2"
SRC_URI = "git://gerrit.osmocom.org/libosmo-abis.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.5.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
