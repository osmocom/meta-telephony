require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "67d32a0386b1c0bfb7a12f63b5bb475a08010e80"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
