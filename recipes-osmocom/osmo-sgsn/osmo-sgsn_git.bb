require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "39c67e2640fc34346dffe3cff9f9f8e905fe5ad9"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
