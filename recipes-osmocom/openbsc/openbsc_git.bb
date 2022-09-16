require ${PN}.inc

PV = "1.4.2+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.0"

SRCREV = "21cebdfa29829975e5b94688f3fc8d0b10e3fa14"
SRC_URI += "git://gerrit.osmocom.org/openbsc.git;protocol=https"

S = "${WORKDIR}/git/openbsc"
