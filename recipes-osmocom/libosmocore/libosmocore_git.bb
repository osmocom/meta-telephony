require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c1cb75eff5b060da9e6d43521e4913a8bf4e74fc"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.8.1+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"

EXTRA_OECONF += "--disable-pcsc"
