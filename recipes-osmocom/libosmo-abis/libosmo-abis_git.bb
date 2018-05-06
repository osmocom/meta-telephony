require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "49917c129b1456585258b0ebe89a513ecef823a8"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
