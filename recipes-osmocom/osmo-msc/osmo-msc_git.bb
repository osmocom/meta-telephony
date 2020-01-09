require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "4a5ba81f7d057373ed44ab66169faa1f9d7b46ea"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.6.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
