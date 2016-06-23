require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "accb78000b6161d5f76eae24e625c01533001b89"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
