require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0b7ad1a72fae2a4547bf0d1d6430918a74ea577b"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "1.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
