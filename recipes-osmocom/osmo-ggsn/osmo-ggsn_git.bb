require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "b673d1c438488fb74abda344e563d733e5ce451a"
SRC_URI = "git://git.osmocom.org/osmo-ggsn                   \
           file://osmo-ggsn.init                             \
           file://libgtp-queue_depth_32.patch		    \
          "
PV = "1.2.2+gitr${SRCPV}"
PR = "${INC_PR}.0"
