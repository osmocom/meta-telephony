require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d426d458ca96ba29793e35b1b2a73fbcb3b2c888"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.2"
