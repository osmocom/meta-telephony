DESCRIPTION = "An utility library for Open Source Mobile Communications"
DEPENDS = "libosmocore libosmo-netif"
HOMEPAGE = "https://osmocom.org/projects/libosmo-sccp"
LICENSE = "AGPLv3"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

inherit autotools pkgconfig systemd

ALLOW_EMPTY_libosmo-sccp = "1"
