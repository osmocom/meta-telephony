require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "bf7976c0b0076410ad1bd67061dd18d0f33a7f43"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.1"
