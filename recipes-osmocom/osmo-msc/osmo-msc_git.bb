require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "4e7ece0bd969389132d7babf8de4f57cf7d0126f"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
