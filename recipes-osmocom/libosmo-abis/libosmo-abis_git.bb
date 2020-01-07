require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c313d44272f04b24dad38f4caea17180f9cbc509"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.8.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
