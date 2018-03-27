require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "70e7f21cb1748dbc766361d139d8854f7f63ceb0"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
