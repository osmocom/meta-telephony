require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "efb9af4dada5e2426e69d670f4549f8fec3c9cb2"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
