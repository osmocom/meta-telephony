require ${PN}.inc

PV = "0.13.0+gitr${SRCPV}"
PR = "${INC_PR}.5"

SRCREV = "5160996d4a24fdb9faf0317c489689b5c31eebee"
SRC_URI += "git://git.osmocom.org/openbsc.git;protocol=git \
    file://upgrade-mncc-version.patch \
    file://0001-systemd-Add-Install-section-to-service-files.patch"

S = "${WORKDIR}/git/openbsc"
