require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "70fcbda6dd733a503e9a046e01986d8bfc2e2bb2"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.9.0+gitr${SRCPV}"
PR = "r0"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
