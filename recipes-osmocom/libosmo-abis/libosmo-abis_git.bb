require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a49c24d9657471deb90a9425cabdb8d3d56f36df"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.1"
