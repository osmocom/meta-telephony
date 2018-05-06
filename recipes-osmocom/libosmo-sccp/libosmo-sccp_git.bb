require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c88605c41c25b34d2e2b08f0e1028c2bd6d9404b"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
