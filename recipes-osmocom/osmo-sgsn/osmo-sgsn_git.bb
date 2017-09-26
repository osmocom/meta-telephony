require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "341d446b4db87b48812afe8d2149ebc840e8a357"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
