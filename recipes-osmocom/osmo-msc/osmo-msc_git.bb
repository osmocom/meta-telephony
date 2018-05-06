require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "cb8c75bba030c7ab9f2e49b2f40292a1738f3220"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
