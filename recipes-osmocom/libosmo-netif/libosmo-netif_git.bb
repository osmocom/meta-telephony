require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "322dbbeaa29cb90c6917fa7e78a66b96b8ce3689"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
