require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d4be141ab0922427232db660e09befd064a6bace"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
