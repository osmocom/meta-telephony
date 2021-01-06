require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ea1337b4cfbf3ff1a715f1936ae519230ddcd42d"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.6.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
