require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f6415ea5a6bfd796c854dc0bace326de26bf26f1"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.1.6+gitr${SRCPV}"
PR = "${INC_PR}.2"
