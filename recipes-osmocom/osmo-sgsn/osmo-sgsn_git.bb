require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "b24af2bddf584b1f6d305efc5c5e762c32ae7251"
SRC_URI = "git://git.osmocom.org/osmo-sgsn.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
