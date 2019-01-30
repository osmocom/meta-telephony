require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "41e7cf115d4148a9f34fcb863b68b2d5370e335d"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.3.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
