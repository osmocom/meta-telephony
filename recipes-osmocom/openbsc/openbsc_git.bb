require ${PN}.inc

PV = "0.15.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.2"

SRCREV = "6a8cbe9718d2fdf2c0ace0b70508de6e0a406345"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
