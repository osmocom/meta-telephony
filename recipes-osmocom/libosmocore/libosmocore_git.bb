require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "5fa0dcc2750a79920d4a6404e960c50667840058"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.9.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

DEPENDS += "talloc"

EXTRA_OECONF += "--disable-pcsc --with-system-talloc --disable-talloc"
