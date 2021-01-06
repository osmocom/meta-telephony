require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a6d0455529011550610cde4479abfd9abd86da4e"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.6.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
