DESCRIPTION = "Osmocom network interface library"
HOMEPAGE = "http://gerrit.osmocom.org"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

DEPENDS = "libosmo-abis libtalloc"

PACKAGECONFIG ??= "\
    libsctp \
    "
PACKAGECONFIG[libsctp] = "--enable-libsctp,--disable-libsctp,lksctp-tools,"

# Workaround to oe-core meta/site/* CONFIG_SITE files passed to autoconf forcing unavailability of netinet/sctp.h.
# Patch fixing issue upstream: https://patchwork.openembedded.org/patch/168892/
CACHED_CONFIGUREVARS += "${@bb.utils.contains('PACKAGECONFIG', 'libsctp', 'ac_cv_header_netinet_sctp_h=yes', '',d)}"

inherit autotools pkgconfig
