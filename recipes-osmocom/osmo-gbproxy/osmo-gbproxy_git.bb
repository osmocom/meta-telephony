require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.4.1"
SRC_URI = "git://gerrit.osmocom.org/osmo-gbproxy.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "0.4.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
