require ${PN}.inc

PV = "0.1.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.1"

SRCREV = "743cf42ac5dfa2661317e73f70b204bde7450ff2"
SRC_URI += "git://git.osmocom.org/osmo-hlr.git;protocol=git"

S = "${WORKDIR}/git/osmo-hlr"
