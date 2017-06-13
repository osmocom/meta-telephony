require ${PN}.inc

PV = "0.1.0+gitr${SRCPV}"
PRINC = "0"
PR = "${INC_PR}.1"

SRCREV = "63b7e86dcf552fb04eab8337c930ced6c970b3c8"
SRC_URI += "git://git.osmocom.org/osmo-hlr.git;protocol=git\
            file://0001-Disable-tests-because-python3-is-not-available.patch"

S = "${WORKDIR}/git/"
