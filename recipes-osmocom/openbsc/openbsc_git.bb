require ${PN}.inc

PV = "0.14.0+gitr${SRCPV}"
PR = "${INC_PR}.6"

SRCREV = "66105fd3dc043e0f8011e1fa47864611936dd6aa"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch"

S = "${WORKDIR}/git/openbsc"
