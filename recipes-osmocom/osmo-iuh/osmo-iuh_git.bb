require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "5a3df8fa9ffc4400367250a0f9ff0e20dc4b5d3b"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
