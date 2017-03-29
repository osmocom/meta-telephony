require ${PN}.inc

PV = "0.14.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.6"

# openbsc.git branch vlr_3G
SRCREV = "2e8ecf3af3c1ffab29357f45e4576b2d3b9268e4"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch"

S = "${WORKDIR}/git/osmocom-3g"
