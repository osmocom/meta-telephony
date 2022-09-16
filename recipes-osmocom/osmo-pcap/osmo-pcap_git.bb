require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.4.0"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
