require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=https"
PV = "1.10.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
