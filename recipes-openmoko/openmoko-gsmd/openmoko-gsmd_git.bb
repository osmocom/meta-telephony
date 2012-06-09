DESCRIPTION = "GSM libraries and daemons implementing the ETSI 07.10 specification"
HOMEPAGE = "http://www.openmoko.org"
SECTION = "telephony"

LICENSE = "GPLv2+ & LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe \
                    file://COPYING.library;md5=2d5025d4aa3495befef8f17206a5b0a1 "

# Fork with wavecom support
SRC_URI = "git://git.gnumonks.org/openmoko-gsmd.git;branch=master \
           file://gsmd \
           file://default"
SRCREV = "28e25ae42da7d65face9ad2472075f7c4fc87e92"
S = "${WORKDIR}/git"

PR = "r7"

inherit autotools pkgconfig update-rc.d


# handle update-rc.d RDEPENDS_${PN} manually, we don't need it on
# anything but gsmd

INITSCRIPT_NAME = "gsmd"
INITSCRIPT_PARAMS = "defaults 35"

do_install_append() {
	install -d ${D}/${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/gsmd ${D}/${sysconfdir}/init.d/
	install -d ${D}/${sysconfdir}/default
	install ${WORKDIR}/default ${D}/${sysconfdir}/default/gsmd
}

PACKAGES =+ "\
  ${PN}-tools \
  ${PN}-plugins \
  ${PN}-plugin-machine-generic \
  ${PN}-plugin-machine-tihtc \
  ${PN}-plugin-machine-gta01 \
  ${PN}-plugin-machine-telit \
  ${PN}-plugin-vendor-bcm \
  ${PN}-plugin-vendor-qc \
  ${PN}-plugin-vendor-telit \
  ${PN}-plugin-vendor-ti \
  ${PN}-plugin-vendor-tihtc \
  ${PN}-plugin-vendor-wavecom \
"

RDEPENDS_${PN}-plugins = "\
  ${PN}-plugin-machine-generic \
  ${PN}-plugin-machine-tihtc \
  ${PN}-plugin-machine-gta01 \
  ${PN}-plugin-machine-telit \
  ${PN}-plugin-vendor-bcm \
  ${PN}-plugin-vendor-qc \
  ${PN}-plugin-vendor-telit \
  ${PN}-plugin-vendor-ti \
  ${PN}-plugin-vendor-tihtc \
  ${PN}-plugin-vendor-wavecom \
"

RDEPENDS_${PN} += "update-rc.d"

FILES_${PN}-dbg += "${libdir}/gsmd/.debug/*"
FILES_${PN}-tools = "${bindir}/*"
FILES_${PN}-plugins = ""
FILES_${PN}-dev += " ${libdir}/gsmd/*.la "
FILES_${PN}-staticdev += " ${libdir}/gsmd/*.a"
FILES_${PN}-plugin-machine-generic = "${libdir}/gsmd/libgsmd-machine_generic.so*"
FILES_${PN}-plugin-machine-tihtc = "${libdir}/gsmd/libgsmd-machine_tihtc.so*"
FILES_${PN}-plugin-machine-gta01 = "${libdir}/gsmd/libgsmd-machine_gta01.so*"
FILES_${PN}-plugin-machine-telit = "${libdir}/gsmd/libgsmd-machine_telit.so*"
FILES_${PN}-plugin-vendor-qc = "${libdir}/gsmd/libgsmd-vendor_qc.so*"
FILES_${PN}-plugin-vendor-bcm = "${libdir}/gsmd/libgsmd-vendor_bcm.so*"
FILES_${PN}-plugin-vendor-telit = "${libdir}/gsmd/libgsmd-vendor_telit.so*"
FILES_${PN}-plugin-vendor-ti = "${libdir}/gsmd/libgsmd-vendor_ti.so*"
FILES_${PN}-plugin-vendor-tihtc = "${libdir}/gsmd/libgsmd-vendor_tihtc.so*"
FILES_${PN}-plugin-vendor-wavecom = "${libdir}/gsmd/libgsmd-vendor_wavecom.so*"

PACKAGES_DYNAMIC = "lib${PN}* ${PN}"

ALLOW_EMPTY_${PN}-plugins = "1"

