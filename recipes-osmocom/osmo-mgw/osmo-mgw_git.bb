require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "50e52e45f9c01d5799520ddb53565b868729801f"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
