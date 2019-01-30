require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c775ffe1cc6cfd842566d30c96d287502d9d6218"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
