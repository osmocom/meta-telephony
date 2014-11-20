require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.6"

SRCREV = "b1edf7b64f6c05932c83b4d31b1127f2a833601e"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch"

S = "${WORKDIR}/git/openbsc"
