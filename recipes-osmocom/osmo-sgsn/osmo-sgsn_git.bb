require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d7ef94c0bb48797cb53947773c9e59ccdedc72bb"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
