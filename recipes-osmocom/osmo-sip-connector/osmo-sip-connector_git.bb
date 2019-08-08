require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f56af15181afdeeb9b517c589b7a220820b0083b"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
