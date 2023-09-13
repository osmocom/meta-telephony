require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.10.2"
SRC_URI = "git://gerrit.osmocom.org/osmo-ggsn;protocol=https;tag=${SRCREV};nobranch=1 \
           file://0001-libgtp-set-PDP_MAX-to-128.patch	    \
          "
PV = "1.10.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
