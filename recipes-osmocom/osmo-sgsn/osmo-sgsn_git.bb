require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "394aa533e9e3a744dfe10c2cf01898dabb8d6812"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
