require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a1362ce8c20b2fa60e3da67936ea69d406e23aff"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
