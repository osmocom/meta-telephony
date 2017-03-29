DESCRIPTION = "library to build asn1c generated sources"
DEPENDS = "libtalloc"
DEPENDS_append_geode = "dahdi-linux"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

inherit autotools pkgconfig
