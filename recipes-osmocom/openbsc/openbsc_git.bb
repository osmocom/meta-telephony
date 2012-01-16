require ${PN}.inc

PV = "0.10.1+gitr${SRCPV}"
PR = "${INC_PR}.1"

SRCREV = "aa433d2d8418b73760fd1f9db1c9e84a05fe3551"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
