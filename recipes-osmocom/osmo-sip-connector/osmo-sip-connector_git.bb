require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "336add4990191011ec6b8f621593e24b2ad5e324"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
