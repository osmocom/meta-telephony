require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f8699ca51eeb4f3d34336501abcaf071b4a95a47"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.8.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
