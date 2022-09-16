require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.3.2"
SRC_URI = "git://git.osmocom.org/osmo-sysmon.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
