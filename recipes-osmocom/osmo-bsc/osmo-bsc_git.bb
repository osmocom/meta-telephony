require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.11.0"
SRC_URI = "git://gerrit.osmocom.org/osmo-bsc.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.11.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
