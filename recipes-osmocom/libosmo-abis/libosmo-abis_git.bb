require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "3cef39b03cb46de4a7aba65137d724a000b184cb"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.1"
