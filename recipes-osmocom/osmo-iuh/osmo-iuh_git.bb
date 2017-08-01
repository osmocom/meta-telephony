require ${PN}.inc

PV = "0.1.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.2"

SRCREV = "26531f9efc3a7366ef26e11855bc8ad46e9f8794"
SRC_URI += "git://git.osmocom.org/osmo-iuh.git;protocol=git"

S = "${WORKDIR}/git"
