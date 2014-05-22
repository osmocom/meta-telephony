DESCRITOPN = "Osmux utility classes"
DEPENDS = "libosmo-abis"
HOMEPAGE = "http://git.osmocom.org"
LICENSE = "GPLv2+"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools_stage pkgconfig
