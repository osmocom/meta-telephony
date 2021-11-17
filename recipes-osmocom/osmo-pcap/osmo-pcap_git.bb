require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.2.1"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git;tag=${SRCREV};nobranch=1"
PV = "0.2.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
