require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.3.2"
SRC_URI = "git://gerrit.osmocom.org/osmo-sysmon.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
