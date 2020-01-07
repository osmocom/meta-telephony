require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ec45068972b85c6ace5483c5f533dae8e7975d41"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.7.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
