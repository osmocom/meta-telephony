require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "be4bbeb01b85cbe38c70e0f272e59e4c57f13aa2"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
