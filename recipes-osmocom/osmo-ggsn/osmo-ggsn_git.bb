require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e71e0f2af84d8b26f4c09a8c859f86cf701b3357"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.5.0+gitr${SRCPV}"
PR = "${INC_PR}.0"
