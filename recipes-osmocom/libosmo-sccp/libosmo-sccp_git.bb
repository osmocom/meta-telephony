require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "688f2304056029f47073a549d7e41043eab5a0fd"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.10.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
