require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "3b25774db5b584e926dab2534d93314f910f62b6"
SRC_URI = "git://git.osmocom.org/osmo-sysmon.git;protocol=git"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
