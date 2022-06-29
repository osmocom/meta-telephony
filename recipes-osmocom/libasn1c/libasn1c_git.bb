require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.9.34"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "0.9.34+gitr${SRCPV}"
PR = "${INC_PR}.0"
