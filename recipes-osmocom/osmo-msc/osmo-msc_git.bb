require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.16.0"
SRC_URI = "git://gerrit.osmocom.org/osmo-msc.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
