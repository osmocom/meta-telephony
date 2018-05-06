DESCRIPTION = "Osmocom network interface library"
DEPENDS = "libosmo-abis libtalloc lksctp-tools"
HOMEPAGE = "http://git.osmocom.org"
LICENSE = "GPLv2+"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig
