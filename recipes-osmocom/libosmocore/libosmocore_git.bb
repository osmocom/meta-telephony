require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a99d45ac5960c25818b980683cb5920ffd25588c"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.9.0+gitr${SRCPV}"
PR = "r1"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
