require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.5"

SRCREV = "421365eeaa104a9781214f9e12c55023c1099bf8"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch \
    file://0001-systemd-Add-Install-section-to-service-files.patch"

S = "${WORKDIR}/git/openbsc"
