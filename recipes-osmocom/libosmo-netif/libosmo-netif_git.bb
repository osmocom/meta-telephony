require ${PN}.inc

DEPENDS += "libtalloc lksctp-tools"

S = "${WORKDIR}/git"
SRCREV = "59941982083f7f0d6ab11f7bbb42c297a3fb8d69"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
