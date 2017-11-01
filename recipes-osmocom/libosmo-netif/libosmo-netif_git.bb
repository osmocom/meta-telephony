require ${PN}.inc

DEPENDS += "libtalloc lksctp-tools"

S = "${WORKDIR}/git"
SRCREV = "c72be77aa330c968f9f1d624e38141b3c2e24323"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.1.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
