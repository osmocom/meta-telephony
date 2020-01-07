require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "6a0c4d9d24f7a591018898459b8767c6d1447309"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
