require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
