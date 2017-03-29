require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "20d668cbd3c14ef32fcbd09617fbd3c8e6856ec0"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
