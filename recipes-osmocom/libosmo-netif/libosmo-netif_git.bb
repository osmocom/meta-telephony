require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "603f6c40d55b87f81fbd8ff1ad7b9568f3b962ff"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.2"
