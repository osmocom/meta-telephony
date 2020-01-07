require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "b8121e79ef53b30df535fb38987b3a48853ebbe9"
SRC_URI = "git://git.osmocom.org/libosmo-netif.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
