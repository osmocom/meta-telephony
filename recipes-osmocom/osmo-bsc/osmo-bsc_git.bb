require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "3c9485751cd20215ca6029df8dde4be94ee6f39d"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
