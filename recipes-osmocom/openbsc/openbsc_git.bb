require ${PN}.inc

PV = "0.14.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.6"

SRCREV = "57ee78078905c7499bd4e6857f8981d22badfcac"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch"

S = "${WORKDIR}/git/openbsc"
