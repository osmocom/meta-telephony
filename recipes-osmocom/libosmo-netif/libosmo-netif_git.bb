require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.2.0"
SRC_URI = "git://gerrit.osmocom.org/libosmo-netif.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
