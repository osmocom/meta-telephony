SUMMARY = "Runtime library of Lev Walkin's asn1c split out as separate library"
HOMEPAGE = "https://osmocom.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=25192323023bb0db6998ac6fcd5aa6a1"

DEPENDS = "libtalloc"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig
