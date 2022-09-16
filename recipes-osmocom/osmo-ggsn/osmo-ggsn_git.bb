require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://gerrit.osmocom.org/osmo-ggsn;protocol=https \
           file://0001-libgtp-set-PDP_MAX-to-128.patch	    \
          "
PV = "1.9.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
