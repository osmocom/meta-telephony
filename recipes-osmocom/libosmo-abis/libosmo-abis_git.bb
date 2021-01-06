require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.0.1"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
