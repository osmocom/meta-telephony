DESCRITOPN = "Digium Asterisk Hardware Driver Interface - Linux kernel part"
SECTION = "base"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPL"
RDEPENDS_${PN} = "kernel (${KERNEL_VERSION})"
DEPENDS = "virtual/kernel"
RRECOMMENDS_${PN} = "dahdi-firmware"

# those firmware images are normally downloaded as part of the 'make'
# process of dahdi-linux.  In the context of OE, we want to list them
# here so they are part of the 'downloads' directory and thus don't need
# to be downloaded all the time.
FIRMWARE_URI = " \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-hx8-2.06.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-064-1.05.01.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-128-1.05.01.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-tc400m-MR6.12.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-vpmadt032-1.07.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-vpmoct032-1.11.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-vpmoct032-1.8.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.17.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.18.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.19.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.20.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.22.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.25.0.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/zaptel-fw-oct6114-064-1.05.01.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/zaptel-fw-oct6114-128-1.05.01.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/zaptel-fw-tc400m-MR5.6.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/zaptel-fw-tc400m-MR6.12.tar.gz \
http://downloads.digium.com/pub/telephony/firmware/releases/zaptel-fw-vpmadt032-1.07.tar.gz\
	"

SRC_URI = "http://downloads.asterisk.org/pub/telephony/dahdi-linux/releases/dahdi-linux-${PV}.tar.gz ${FIRMWARE_URI}"
# why does this not work?
#SRC_URI =+ "${FIRMWARE_URI}"

INC_PR="r3"

LIC_FILES_CHKSUM = "file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a"

inherit module

do_configure() {
	# make sure the extracted firmware.bin are where Makefile expects
	mv ../dahdi-fw-*.bin ../zaptel-fw-*.bin drivers/dahdi/firmware/
	cp ${DL_DIR}/dahdi-fwload-*.tar.gz drivers/dahdi/firmware/
	cp ${DL_DIR}/zaptel-fw-*.tar.gz drivers/dahdi/firmware/
	cp ${DL_DIR}/dahdi-fw-*.tar.gz drivers/dahdi/firmware/
}

do_compile () {
	do_make_scripts
	unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
	oe_runmake KSRC=${STAGING_KERNEL_DIR}   \
		   KVERS=${KERNEL_VERSION}    \
		   CC="${KERNEL_CC}" LD="${KERNEL_LD}" \
		   AR="${KERNEL_AR}" \
		   ${MAKE_TARGETS}
}

do_install () {
	unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
	oe_runmake DEPMOD=echo DESTDIR="${D}" \
	           KSRC=${STAGING_KERNEL_DIR} \
		   KVERS=${KERNEL_VERSION}    \
	           CC="${KERNEL_CC}" LD="${KERNEL_LD}" \
	           install
}

PACKAGES =+ "dahdi-firmware"

FILES_${PN} = "${base_libdir}/modules/ ${sysconfdir}/udev/rules.d"

FILES_dahdi-firmware = "${base_libdir}/firmware /usr/share/dahdi"
PACKAGE_ARCH_dahdi-firmware = "all"
