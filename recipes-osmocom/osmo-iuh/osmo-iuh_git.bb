require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.8.1"
SRC_URI = "git://gerrit.osmocom.org/osmo-iuh.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
