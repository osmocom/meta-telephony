require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "92a88ee73f471a4ddb7b864ae9f487493307a175"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
