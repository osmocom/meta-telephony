DESCRIPTION = "Osmocom network interface library"
HOMEPAGE = "http://git.osmocom.org"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

DEPENDS = "libosmo-abis libtalloc"

PACKAGECONFIG ??= "\
    libsctp \
    "
PACKAGECONFIG[libsctp] = "--enable-libsctp,--disable-libsctp,lksctp-tools,"

inherit autotools pkgconfig
