require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "cf5fbea78f2f7316e7cbe91f32cb79b4a02abd75"
SRC_URI = "git://git.osmocom.org/osmo-iuh.git;protocol=git"
PV = "0.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
