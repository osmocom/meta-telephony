require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
