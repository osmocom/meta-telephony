require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.7.1+gitr${SRCPV}"
PR = "${INC_PR}.0"
