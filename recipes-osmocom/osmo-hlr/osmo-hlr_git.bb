require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "9cf0030b6a8e41fbcfec6cedb5f6c2c5871d7931"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "1.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
