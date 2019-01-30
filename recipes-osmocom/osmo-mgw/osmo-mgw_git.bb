require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e81c1176aa1254b0bb148385134186f6a55fd405"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
