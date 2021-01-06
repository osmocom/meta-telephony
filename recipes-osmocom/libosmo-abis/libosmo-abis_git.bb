require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "df184518e751d9062d35982325252e95e3d54db1"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
