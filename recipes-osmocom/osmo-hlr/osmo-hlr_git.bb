require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "43bd6069e83ff034dcaff4780891d0468e899b07"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
