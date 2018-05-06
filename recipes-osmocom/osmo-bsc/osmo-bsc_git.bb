require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1b11bc808f9fe4234bb3b42965f8b7ca5c33e303"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
