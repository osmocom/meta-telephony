require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "aaae8c76496a97050264e4c49e539b0420496737"
SRC_URI = "git://git.osmocom.org/libasn1c.git;protocol=git"
PV = "0.9.28+gitr${SRCPV}"
PR = "${INC_PR}.0"
