require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "026ff4574daedcf91a474f9bc67e90e8537a9d86"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.5.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
