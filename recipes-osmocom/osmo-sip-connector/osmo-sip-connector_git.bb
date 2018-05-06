require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "55faf3867540f5d42a69e17cdc02f0e522f42478"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.1.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
