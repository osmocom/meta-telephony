require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a8eafef966bfbd8046ee8319b889b2dee8391434"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.1.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
