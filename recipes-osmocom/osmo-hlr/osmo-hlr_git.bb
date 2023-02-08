require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.6.0"
SRC_URI = "git://gerrit.osmocom.org/osmo-hlr.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
