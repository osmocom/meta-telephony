require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.1.3"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "0.1.3+gitr${SRCPV}"
PR = "${INC_PR}.0"
