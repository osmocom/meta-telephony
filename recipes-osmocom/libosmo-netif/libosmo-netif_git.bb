require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "fb88e6b78ea7fadd8eb0e07c6ecb2b1539874f97"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
