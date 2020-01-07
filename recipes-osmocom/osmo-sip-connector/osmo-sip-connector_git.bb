require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e58ead7ac4c0e97f82ceef828b8da30f7cb84927"
SRC_URI = "git://git.osmocom.org/osmo-sip-connector.git;protocol=git"
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
