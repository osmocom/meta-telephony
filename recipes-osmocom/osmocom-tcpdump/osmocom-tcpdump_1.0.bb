DESCRIPTION = "Osmocom round-robin tcpdump/capture"
LICENSE = "GPLv3+"
RDEPENDS_${PN} = "tcpdump bash"
PR = "r11"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

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
