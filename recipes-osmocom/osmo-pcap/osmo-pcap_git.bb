require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0.8.1"
SRC_URI = "git://gerrit.osmocom.org/osmo-pcap.git;protocol=https;tag=${SRCREV};nobranch=1"
PV = "${SRCREV}+gitr${SRCPV}"
PR = "${INC_PR}.0"
