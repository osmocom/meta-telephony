require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "0218814c8c099d6e9e6ba1e85f8d0d6672a32214"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
