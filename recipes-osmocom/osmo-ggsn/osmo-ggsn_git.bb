require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "f5a268a96d7d3c7bcfbc530f2a0b334cf25d3e3c"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
