require ${PN}.inc

DEPENDS += "libtalloc"

S = "${WORKDIR}/git"
SRCREV = "01543a1ea392fa98974ea2f99cafbc28e9966656"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
