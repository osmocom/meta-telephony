DESCRITOPN = "An utility library for Open Source Mobile Communications"
DEPENDS = "libosmocore ortp"
DEPENDS_append_geode = "dahdi-linux"
HOMEPAGE = "http://openbsc.gnumonks.org"
LICENSE = "AGPLv3"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

inherit autotools_stage pkgconfig

ALLOW_EMPTY_libosmo-abis = "1"
