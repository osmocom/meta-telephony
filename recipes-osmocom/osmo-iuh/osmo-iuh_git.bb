require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "505fa9eae765a31289e3a1743f606e83b9cd65d0"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
