require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.6.0"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
