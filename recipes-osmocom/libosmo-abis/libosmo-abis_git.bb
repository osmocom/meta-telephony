require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "7b89f12e66a280746fc8e7906505b2d769d19706"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
