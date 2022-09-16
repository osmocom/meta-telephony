require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=https"
PV = "1.6.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
