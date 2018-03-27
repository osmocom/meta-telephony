require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "69e356be93c420b5e2f8b96fbc89ef889cbcfe53"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
