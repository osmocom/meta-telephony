require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e5a9665c009f9b81bbc370480405cb91cbe99b66"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.2.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
