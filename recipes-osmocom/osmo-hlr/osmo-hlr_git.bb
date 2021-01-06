require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "9f092daa64b64b87fcf44eafe2330ba33bbefd48"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "1.2.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
