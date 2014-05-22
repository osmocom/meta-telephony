require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "153f5856607b75ca76c540288cd6b4df144290ff"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.3.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
