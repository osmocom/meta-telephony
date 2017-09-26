require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1c8d67d7f5f6f8788d92df65a0b68e0ec19a34dc"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.0.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
