require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.6.3"
SRC_URI = "git://gerrit.osmocom.org/osmo-sip-connector.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.6.3+gitr${SRCPV}"
PR = "${INC_PR}.0"
