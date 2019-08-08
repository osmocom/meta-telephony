require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "67aebc9d1c6b0773b082b496a579be1a80c2a9b2"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.4.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
