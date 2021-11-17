require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.4.0"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
