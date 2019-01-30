require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "65d937c45c3362504b8900173b8256a5894adae9"
SRC_URI = "git://git.osmocom.org/osmo-sysmon.git;protocol=git"
PV = "0.0.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
