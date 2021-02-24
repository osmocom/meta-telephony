require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.7.0"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.7.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
