require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "4bd710d107786ecf838f568171a0175d157e809d"
SRC_URI = "git://git.osmocom.org/osmo-bsc.git;protocol=git"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
