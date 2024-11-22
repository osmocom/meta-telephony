require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.14.0"
SRC_URI = "git://gerrit.osmocom.org/osmo-mgw.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
