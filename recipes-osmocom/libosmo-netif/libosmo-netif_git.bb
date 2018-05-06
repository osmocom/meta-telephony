require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e38ee9b808970cd49663221cb823365ef18797d5"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
