require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.0"
