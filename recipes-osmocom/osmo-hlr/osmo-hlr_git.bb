require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "78f430102516a970b9899f962d4562ebdb718670"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "0.2.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
