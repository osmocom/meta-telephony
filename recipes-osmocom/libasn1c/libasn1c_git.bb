require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.9.35"
SRC_URI = "git://gerrit.osmocom.org/libasn1c.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "0.9.35+gitr${SRCPV}"
PR = "${INC_PR}.0"
