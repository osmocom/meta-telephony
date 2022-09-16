require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-pcap.git;protocol=https"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
