require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-hlr.git;protocol=https"
PV = "1.9.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
