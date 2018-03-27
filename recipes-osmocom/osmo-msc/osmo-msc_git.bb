require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "053e27528cf4da1f96bd5bf78c6982b73b790100"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.1.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
