require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c55d867508c8ddb93a822c018b5ce5a9a72006aa"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
