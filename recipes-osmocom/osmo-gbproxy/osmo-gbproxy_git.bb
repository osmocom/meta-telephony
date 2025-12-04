require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.5.1"
SRC_URI = "git://gerrit.osmocom.org/osmo-gbproxy.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "0.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
