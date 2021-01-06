require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "faea029a466fec48236403aa10d0b1a00f144763"
SRC_URI = "git://git.osmocom.org/osmo-sysmon.git;protocol=git"
PV = "0.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
