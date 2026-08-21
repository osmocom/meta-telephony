require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.13.2"
SRC_URI = "git://gerrit.osmocom.org/osmo-sgsn.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
