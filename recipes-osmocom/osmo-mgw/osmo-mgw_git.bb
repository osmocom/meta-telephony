require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "a330b864e58a5f899c5d8a155f3a788f8c3fb0d9"
SRC_URI = "git://git.osmocom.org/osmo-mgw.git;protocol=git"
PV = "1.1.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
