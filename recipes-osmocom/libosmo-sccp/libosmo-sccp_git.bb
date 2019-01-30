require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "81c6a0a97980f9da76ef0e698ca6ab526b98c7c2"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "1.0.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
