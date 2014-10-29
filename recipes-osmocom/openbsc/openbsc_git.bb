require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.6"

SRCREV = "db64f2e45adf7ac95070361f5b7ec76a44e084fb"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch"

S = "${WORKDIR}/git/openbsc"
