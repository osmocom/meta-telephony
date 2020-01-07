require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "3a66698d87b29e0bf8eb53ca29db7e0f02871abc"
SRC_URI = "git://git.osmocom.org/osmo-hlr.git;protocol=git"
PV = "1.2.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
