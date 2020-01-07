require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d8368cebf8ca159c38027e4cb9109f9f0bcd0a46"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git"
PV = "0.1.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
