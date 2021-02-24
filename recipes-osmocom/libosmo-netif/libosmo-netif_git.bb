require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libosmo-netif.git;protocol=https"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
