require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "319a52b577843f6eebb00d8039c2e2479adc8da5"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
