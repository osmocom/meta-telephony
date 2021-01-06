require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e013b3b1eb57250befb53445f82e2e732fcbf37a"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.6.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
