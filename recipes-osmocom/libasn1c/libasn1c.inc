DESCRIPTION = "library to build asn1c generated sources"
DEPENDS = "libtalloc"
DEPENDS_append_geode = "dahdi-linux"
HOMEPAGE = "http://osmocom.org"
LICENSE = "AGPLv3"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=25192323023bb0db6998ac6fcd5aa6a1"

inherit autotools pkgconfig
