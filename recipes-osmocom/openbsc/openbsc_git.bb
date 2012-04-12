require ${PN}.inc

PV = "0.10.1+gitr${SRCPV}"
PR = "${INC_PR}.1"

SRCREV = "09db1a44bc56e81780954555acfbc1bf2fb7cc81"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
