require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-sgsn.git;protocol=https"
PV = "1.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
