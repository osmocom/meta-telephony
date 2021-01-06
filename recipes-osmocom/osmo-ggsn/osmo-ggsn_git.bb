require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2154607fb06c9e4d1a286f40c756cdb4f792efdf"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.6.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
