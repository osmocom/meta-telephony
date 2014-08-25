require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "276ca4b1722df573f9af7735820712bcaf32b800"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"

FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"
