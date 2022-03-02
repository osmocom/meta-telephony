require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.8.0"
SRC_URI = "git://git.osmocom.org/osmo-ggsn;protocol=git;tag=${SRCREV};nobranch=1 \
           file://0001-libgtp-set-PDP_MAX-to-128.patch	    \
          "
PV = "1.8.0+gitr${SRCPV}"
PR = "${INC_PR}.1"
