require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "37880b696ee90dead7e3b1292b109cc041a44e52"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
