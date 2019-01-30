require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e0c6fe5921b30b0e8de35c021be5226c1475c2f5"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "1.0.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
