require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-msc.git;protocol=https"
PV = "1.11.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
