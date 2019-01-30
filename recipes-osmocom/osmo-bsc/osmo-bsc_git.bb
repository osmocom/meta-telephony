require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "117fa9d92d0da3d94a51cbfc1cbeb0d5bdcd3767"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
