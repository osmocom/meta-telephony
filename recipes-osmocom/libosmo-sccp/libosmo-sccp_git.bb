require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "5e4643f4bc76a1437621348550b5b2a603e2179b"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
