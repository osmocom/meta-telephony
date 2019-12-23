DESCRIPTION = "Digium Asterisk Hardware Driver Interface - Linux kernel part"
SECTION = "base"
HOMEPAGE = "http://www.asterisk.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea5bed2f60d357618ca161ad539f7c0a"

DEPENDS = "virtual/kernel"

# those firmware images are normally downloaded as part of the 'make'
# process of dahdi-linux.  In the context of OE, we want to list them
# here so they are part of the 'downloads' directory and thus don't need
# to be downloaded all the time.
FIRMWARE_URI = "\
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-a4a-a0017.tar.gz;name=dahdi-fw-a4a-a0017 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-a4b-d001e.tar.gz;name=dahdi-fw-a4b-d001e \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-a8a-1d0017.tar.gz;name=dahdi-fw-a8a-1d0017 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-a8b-1f001e.tar.gz;name=dahdi-fw-a8b-1f001e \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-hx8-2.06.tar.gz;name=dahdi-fw-hx8 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-032-1.05.01.tar.gz;name=dahdi-fw-oct6114-032 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-064-1.05.01.tar.gz;name=dahdi-fw-oct6114-064 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-128-1.05.01.tar.gz;name=dahdi-fw-oct6114-128 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-oct6114-256-1.05.01.tar.gz;name=dahdi-fw-oct6114-256 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-tc400m-MR6.12.tar.gz;name=dahdi-fw-tc400m-MR6 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-te133-7a001e.tar.gz;name=dahdi-fw-te133-7a001e \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-te134-780017.tar.gz;name=dahdi-fw-te134-780017 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-te435-13001e.tar.gz;name=dahdi-fw-te435-13001e \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-te436-10017.tar.gz;name=dahdi-fw-te436-10017 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-te820-1.76.tar.gz;name=dahdi-fw-te820-1.76 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fw-vpmoct032-1.12.0.tar.gz;name=dahdi-fw-vpmoct032 \
    http://downloads.digium.com/pub/telephony/firmware/releases/dahdi-fwload-vpmadt032-1.25.0.tar.gz;name=dahdi-fwload-vpmadt032 \
"

SRC_URI[dahdi-fw-a4a-a0017.md5sum] = "7fab377be2dff23188e234475bc044f9"
SRC_URI[dahdi-fw-a4a-a0017.sha256sum] = "d5b6ab6851e431afcfec2ecc39d95fa88fe3939ffdb2e3d4f28a43cabf30e95b"
SRC_URI[dahdi-fw-a4b-d001e.md5sum] = "f16247c3d92d9b1d183de28230fa85b1"
SRC_URI[dahdi-fw-a4b-d001e.sha256sum] = "e039af8bec36407b74e1dd9ebdd49ba077469eda79d4e6093721ed2836d4536f"
SRC_URI[dahdi-fw-a8a-1d0017.md5sum] = "1e771e250721105013cbdb6b6e66f9dc"
SRC_URI[dahdi-fw-a8a-1d0017.sha256sum] = "5064f9877b8aec99b19fd57988216fe1a9c0b7c07853dd3b32b5a55ab7b418e6"
SRC_URI[dahdi-fw-a8b-1f001e.md5sum] = "014b46ac0b04cd93327908a082304dd0"
SRC_URI[dahdi-fw-a8b-1f001e.sha256sum] = "09a8992786309e025aa60b400a2c7d21226ac9bb6f1b66f562a5e7e9dc892b03"
SRC_URI[dahdi-fw-hx8.md5sum] = "a7f3886942bb3e9fed349a41b3390c9f"
SRC_URI[dahdi-fw-hx8.sha256sum] = "449ab3fd03d55d808e999efb7677cd04de202b92c9fcb039539a7e48a39a80f5"
SRC_URI[dahdi-fw-oct6114-032.md5sum] = "5e0b48da8a9912f2a40a0e0508c96948"
SRC_URI[dahdi-fw-oct6114-032.sha256sum] = "7a006073202d67e45f1d5ff1e9c6e8663e6056cef9dc4c5abae86a1018db349c"
SRC_URI[dahdi-fw-oct6114-064.md5sum] = "88db9b7a07d8392736171b1b3e6bcc66"
SRC_URI[dahdi-fw-oct6114-064.sha256sum] = "56bac1f2024c76ecf9b6f40992eeea29a1fbee676bb2a37a058179bacfbb1c91"
SRC_URI[dahdi-fw-oct6114-128.md5sum] = "c1f1a18d3e20d283f42c71e580a64b5a"
SRC_URI[dahdi-fw-oct6114-128.sha256sum] = "e1146749d205c41603b9b76852c3f8104dac233d0025d700db24504d10c99775"
SRC_URI[dahdi-fw-oct6114-256.md5sum] = "4b3b763fc89f81d569a42da7c9ef0eee"
SRC_URI[dahdi-fw-oct6114-256.sha256sum] = "5fe5036a2766cf0e8a968b0c58b700507d86e1cde9296ca437170cc626a9c79c"
SRC_URI[dahdi-fw-tc400m-MR6.md5sum] = "2ea860bb8a9d8ede2858b9557b74ee3c"
SRC_URI[dahdi-fw-tc400m-MR6.sha256sum] = "11dd8d009809e41fc9a3a36766f59ff73d29075eede5b8724331d9a6e5259774"
SRC_URI[dahdi-fw-te133-7a001e.md5sum] = "74f0ca211d31dc6683126cfaf399de91"
SRC_URI[dahdi-fw-te133-7a001e.sha256sum] = "511c1966295a20df673bb87af30245f0ad165efd6ccb92b4d8ed535ca7f5ac65"
SRC_URI[dahdi-fw-te134-780017.md5sum] = "71eda5003be050e9cd2f9ecea4fc898b"
SRC_URI[dahdi-fw-te134-780017.sha256sum] = "99f7c410bf47d2a5ae687d717e51448ce5b52aca902830bf39bffe683150fa2d"
SRC_URI[dahdi-fw-te435-13001e.md5sum] = "19bd5ac1ac886c38258d7079ff18ca83"
SRC_URI[dahdi-fw-te435-13001e.sha256sum] = "c8f55d57cc0bf332e8d96cdf9ff6dd0e322f33581e1efc24c2b9a0e0c5eb7ee4"
SRC_URI[dahdi-fw-te436-10017.md5sum] = "44b5a653aeab6f0e1e73348195c04a58"
SRC_URI[dahdi-fw-te436-10017.sha256sum] = "0980f4a8d191c6872aa27d971758046f0e7827ac161549f2cc1b0eeab0ae9333"
SRC_URI[dahdi-fw-te820-1.76.md5sum] = "07b389e2a4f2a2513240187f1c295626"
SRC_URI[dahdi-fw-te820-1.76.sha256sum] = "5b823e25828e2c1c6548886ad408b2e31dbc8cd17170c52592792d9c754a199c"
SRC_URI[dahdi-fw-vpmoct032.md5sum] = "2c7d5b17c23c34624158ee640818043b"
SRC_URI[dahdi-fw-vpmoct032.sha256sum] = "6b199cf836f150f9cb35f763f0f502fb52cfa2724a449b500429c746973904ad"
SRC_URI[dahdi-fwload-vpmadt032.md5sum] = "19a660c2073749641072ca644e983cbc"
SRC_URI[dahdi-fwload-vpmadt032.sha256sum] = "3ff26cf80555fd7470b43a87c51d03c1db2a75abcd4561d79f69b6c48298e4a1"

SRC_URI = "\
    http://downloads.asterisk.org/pub/telephony/dahdi-linux/releases/dahdi-linux-${PV}.tar.gz;name=dahdi-linux \
    file://0001-Use-objcopy-from-toolchain.patch \
"
SRC_URI[dahdi-linux.md5sum] = "0281de245f4fa056f765ae2a6e1f1a4b"
SRC_URI[dahdi-linux.sha256sum] = "6270444cb9b345941267b162038cc45f5ef4485139176e88e2c4d22fa35a2c59"

SRC_URI =+ "${FIRMWARE_URI}"

inherit module

export TARGET_SYS
EXTRA_OEMAKE += "KSRC=${STAGING_KERNEL_BUILDDIR}"

do_configure() {
    # make sure the extracted firmware.bin are where Makefile expects
    cp ../*.bin drivers/dahdi/firmware/
    cp ${DL_DIR}/dahdi-fwload-*.tar.gz drivers/dahdi/firmware/
    cp ${DL_DIR}/dahdi-fw-*.tar.gz drivers/dahdi/firmware/
}

do_install() {
    unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
    oe_runmake DEPMOD=echo DESTDIR="${D}" \
        CC="${KERNEL_CC}" LD="${KERNEL_LD}" \
        O=${STAGING_KERNEL_BUILDDIR} \
        install
}

DAHDI_KERNEL_MODULE = "\
    kernel-module-oct612x \
    kernel-module-dahdi-echocan-jpah \
    kernel-module-dahdi \
    kernel-module-xpd-fxo \
    kernel-module-wctdm \
    kernel-module-dahdi-dynamic-loc \
    kernel-module-xpp-usb \
    kernel-module-xpp \
    kernel-module-wcb4xxp \
    kernel-module-wcte43x \
    kernel-module-wctdm24xxp \
    kernel-module-pciradio \
    kernel-module-wcte12xp \
    kernel-module-dahdi-voicebus \
    kernel-module-dahdi-dynamic-ethmf \
    kernel-module-dahdi-dynamic \
    kernel-module-wctc4xxp \
    kernel-module-dahdi-echocan-sec2 \
    kernel-module-xpd-bri \
    kernel-module-wcaxx \
    kernel-module-dahdi-transcode \
    kernel-module-wcte11xp \
    kernel-module-dahdi-echocan-kb1 \
    kernel-module-wcte13xp \
    kernel-module-dahdi-dynamic-eth \
    kernel-module-dahdi-echocan-mg2 \
    kernel-module-wct1xx \
    kernel-module-wct4xxp \
    kernel-module-tor2 \
    kernel-module-xpd-pri \
    kernel-module-wct1xxp \
    kernel-module-wcfxo \
    kernel-module-dahdi-echocan-sec \
    kernel-module-xpd-echo \
    kernel-module-xpd-fxs \
    kernel-module-dahdi-vpmadt032-loader \
"
PACKAGES =+ "dahdi-firmware ${DAHDI_KERNEL_MODULE}"
KERNEL_MODULE_PACKAGE_SUFFIX = ""

FILES_${PN} = "${base_libdir}/modules/ ${sysconfdir}/udev/rules.d"
FILES_dahdi-firmware = "${base_libdir}/firmware ${datadir}/dahdi ${libdir}/hotplug/firmware "

RRECOMMENDS_${PN} = "dahdi-firmware"
