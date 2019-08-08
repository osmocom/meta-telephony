require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "7648a0eb1824e432075353cde10dffdac1cd295e"
SRC_URI = "git://git.osmocom.org/osmo-sysmon.git;protocol=git"
PV = "0.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
