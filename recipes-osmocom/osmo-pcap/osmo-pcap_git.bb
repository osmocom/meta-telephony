require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "5e10f1db125cf869c5f1769df9abdd6084679b3e"
SRC_URI = "git://git.osmocom.org/osmo-pcap.git;protocol=git"
PV = "0.1.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
