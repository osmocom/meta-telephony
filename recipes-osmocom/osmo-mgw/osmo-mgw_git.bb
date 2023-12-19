require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.12.2"
SRC_URI = "git://gerrit.osmocom.org/osmo-mgw.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.12.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
