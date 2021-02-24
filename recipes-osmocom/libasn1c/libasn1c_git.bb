require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libasn1c.git;protocol=https"
PV = "0.9.36+gitr${SRCPV}"
PR = "${INC_PR}.0"
