require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "56add1e78064698fdf909cf000d413357303af8a"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
