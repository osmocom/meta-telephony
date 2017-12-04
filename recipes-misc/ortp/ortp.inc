DESCRIPTION = "An LGPL implementation of RTP - RFC3550"
LICENSE = "LGPLv2.1+"

INC_PR = "r2"

inherit autotools pkgconfig

SRC_URI = "http://download.savannah.gnu.org/releases/linphone/${PN}/sources/${P}.tar.gz"

LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"

DEPENDS = "glib-2.0 openssl"

do_compile_append() {
        sed -i -e s:${STAGING_DIR_TARGET}::g \
               -e s:/${TARGET_SYS}::g \
                  ortp.pc
}
