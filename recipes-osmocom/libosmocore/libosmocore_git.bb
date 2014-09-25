require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "96af78650d1de134ebb37ddb829508cf0bd30c51"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "r2"

PACKAGES =+ "libosmoctrl"

FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"
