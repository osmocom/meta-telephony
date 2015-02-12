require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2f0dd0c01930fbc0dbf0c86946dd0a429f3cd6e2"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
