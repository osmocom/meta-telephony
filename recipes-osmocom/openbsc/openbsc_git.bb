require ${PN}.inc

PV = "0.12.0+gitr${SRCPV}"
PR = "${INC_PR}.2"

SRCREV = "df49a983e2523b94bb62fec3076259355fe0b52b"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
