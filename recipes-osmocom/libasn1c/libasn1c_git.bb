require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "19205a38c34175f4fb4d1d06e77f1d3e4a39c651"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.9.32+gitr${SRCPV}"
PR = "${INC_PR}.0"
