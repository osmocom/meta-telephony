require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-ggsn;protocol=git \
           file://0001-libgtp-set-PDP_MAX-to-128.patch	    \
          "
PV = "1.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
