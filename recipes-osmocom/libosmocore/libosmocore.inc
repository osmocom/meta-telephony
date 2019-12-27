DESCRIPTION = "An utility library for Open Source Mobile Communications"
HOMEPAGE = "http://openbsc.gnumonks.org"
LICENSE = "GPLv2+"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "libtalloc gnutls lksctp-tools"

PACKAGECONFIG ??= "\
    libusb \
    "
PACKAGECONFIG[libusb] = "--enable-libusb,--disable-libusb,libusb,"

inherit autotools pkgconfig
