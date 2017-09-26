require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "05c8b465ab2fe13edb67c95210a9b475f91ebeb3"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
