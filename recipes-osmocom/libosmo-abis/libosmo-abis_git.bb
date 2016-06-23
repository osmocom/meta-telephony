require ${PN}.inc

DEPENDS += "libtalloc"

S = "${WORKDIR}/git"
SRCREV = "d1dd22c38e86f123c8f9a93c2789deafdfcb9265"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
