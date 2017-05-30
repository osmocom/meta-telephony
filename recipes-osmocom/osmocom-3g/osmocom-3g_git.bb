require ${PN}.inc

PV = "0.14.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.6"

# openbsc.git branch vlr_3G
SRCREV = "bbd6127480f0d89ab1e1de9583555144ab68062d"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git"

S = "${WORKDIR}/git/openbsc"
