require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "df62bb330e403293d7328b50f1276288ed7faca6"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
