require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "58fcc5344ea0e914c7f9be69c309998d243142bd"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.8.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
