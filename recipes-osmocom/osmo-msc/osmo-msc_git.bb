require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "db8272921dec02e698c2e473ebe210908964c827"
SRC_URI = "git://git.osmocom.org/osmo-msc.git;protocol=git"
PV = "1.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
