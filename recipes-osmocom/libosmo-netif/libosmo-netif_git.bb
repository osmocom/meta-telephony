require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "592057bb33dc0c336a63003cd7a3a67944d92757"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
