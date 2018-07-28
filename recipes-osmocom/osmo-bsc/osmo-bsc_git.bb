require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "08d02dd5100cbff47922427e3beb31a3373bf75c"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
