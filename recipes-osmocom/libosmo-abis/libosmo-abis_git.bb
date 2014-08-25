require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c9295ea2dd1f52931f8670e706a7b0d4b3ac536b"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.2.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
