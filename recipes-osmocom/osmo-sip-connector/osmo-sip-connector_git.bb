require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.6.1"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.6.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
