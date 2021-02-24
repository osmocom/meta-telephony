require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/libsmpp34.git;protocol=https"
PV = "1.14.6+gitr${SRCPV}"
PR = "${INC_PR}.0"
