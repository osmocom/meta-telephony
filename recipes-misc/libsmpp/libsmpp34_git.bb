require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.14.6"
SRC_URI = "git://gerrit.osmocom.org/libsmpp34.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
