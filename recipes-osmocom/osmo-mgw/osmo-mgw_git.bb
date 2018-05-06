require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d761d355f9b71b1dfe462e55a6e030bb026d8bf1"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
