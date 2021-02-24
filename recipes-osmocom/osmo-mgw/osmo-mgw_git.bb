require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-mgw.git;protocol=https"
PV = "1.16.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
