require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.1.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
