require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "00c22464a0c1b51bb4b29efecab39e993224949c"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
