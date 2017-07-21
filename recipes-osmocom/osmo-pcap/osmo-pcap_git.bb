require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "901543a78846cc4e3a0cdae91dead4913b1be961"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git"
PV = "0.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
