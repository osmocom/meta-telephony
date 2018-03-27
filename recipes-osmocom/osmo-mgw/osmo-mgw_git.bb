require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "086c3f3c674a276205a793300c80802d2355cabd"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
