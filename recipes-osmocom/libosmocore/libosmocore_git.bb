require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1a02cfc24d2c812ba13e5aa936588be447bb24af"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PV = "0.6.0+gitr${SRCPV}"
PR = "2"
