require ${PN}.inc

PV = "0.1.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.1"

SRCREV = "c23c4fe06c543648a7c7dc429ce50f5cf79abe3a"
SRC_URI += "git://git.osmocom.org/osmo-iuh.git;protocol=git"

S = "${WORKDIR}/git/osmo-iuh"
