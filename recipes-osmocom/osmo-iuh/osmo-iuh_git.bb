require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ba941e553d60a06a45ad96f0ad4161383d4c0d30"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
