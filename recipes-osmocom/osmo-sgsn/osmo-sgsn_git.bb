require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "065500a3471dd43b65dc87b95854c3015c551f0f"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.6.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
