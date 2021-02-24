require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-iuh.git;protocol=https"
PV = "1.5.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
