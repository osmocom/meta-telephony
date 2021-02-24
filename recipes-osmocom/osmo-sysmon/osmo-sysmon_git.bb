require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-sysmon.git;protocol=https"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
