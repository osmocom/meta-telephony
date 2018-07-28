require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "304b3eb32876cf69b202ee5688e00905fdb336f9"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
