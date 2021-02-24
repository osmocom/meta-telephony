require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.8.1"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.8.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
