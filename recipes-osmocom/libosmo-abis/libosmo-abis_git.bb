require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "3a580f263a24e0ce7d3ed544af0373c22ae9eeac"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
