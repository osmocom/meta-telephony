require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a6a34fd7188bbe46fbd84484610697dd5930d584"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
