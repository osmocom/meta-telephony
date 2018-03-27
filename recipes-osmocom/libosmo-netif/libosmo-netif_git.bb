require ${PN}.inc

DEPENDS += "libtalloc lksctp-tools"

S = "${WORKDIR}/git"
SRCREV = "9d726d0e56665b4439bb4efe782be06be2e83ffb"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.1.1+gitr${SRCPV}"
PR = "${INC_PR}.1"
