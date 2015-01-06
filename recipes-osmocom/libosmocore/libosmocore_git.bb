require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "419684e30c2fe12d3e3441cfa9fea21f1c4de959"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
