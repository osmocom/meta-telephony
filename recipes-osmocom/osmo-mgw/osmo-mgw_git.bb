require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.10.0"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.10.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
