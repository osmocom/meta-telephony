require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "79d76480ac0187993c05b2c682e120f6e0e8bbb8"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.4.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
