DESCRIPTION = "Osmocom round-robin tcpdump/capture"
LICENSE = "GPLv3+"
RDEPENDS = "tcpdump bash"
PR = "r10"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

SRC_URI = " \
  file://osmocom-tcpdump \
  file://tcpdump-compress \
"

do_install () {
  install -d ${D}${sysconfdir}/init.d
  install -d ${D}${sysconfdir}/default
  install -d ${D}${sbindir}

  install -m 0755	${WORKDIR}/osmocom-tcpdump		${D}${sysconfdir}/init.d/
  install -m 0755	${WORKDIR}/tcpdump-compress		${D}${sbindir}/
}

inherit update-rc.d

INITSCRIPT_NAME = "osmocom-tcpdump"
INITSCRIPT_PARAMS = "defaults 21"
