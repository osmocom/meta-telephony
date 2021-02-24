require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "1.7.1"
SRC_URI = "git://git.osmocom.org/osmo-ggsn;protocol=git;tag=${SRCREV};nobranch=1 \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.7.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
