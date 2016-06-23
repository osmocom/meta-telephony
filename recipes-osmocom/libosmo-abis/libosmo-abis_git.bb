require ${PN}.inc

DEPENDS += "libtalloc"

S = "${WORKDIR}/git"
SRCREV = "35003ec2ea7de49d67e5332938a66fe92580b94d"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PV = "0.3.2+gitr${SRCPV}"
PR = "${INC_PR}.1"
