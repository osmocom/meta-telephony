DESCRIPTION = "An utility library for Open Source Mobile Communications"
HOMEPAGE = "https://osmocom.org/projects/libosmo-abis"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"
INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

DEPENDS = "libosmocore ortp libtalloc"

inherit autotools pkgconfig

PACKAGECONFIG ??= "\
    dahdi \
    "
PACKAGECONFIG[dahdi] = "--enable-dahdi,--disable-dahdi,dahdi-linux,"

PACKAGES =+ "libosmotrau libosmotrau-dev"

FILES_libosmotrau = "${libdir}/libosmotrau${SOLIBS}"
FILES_libosmotrau-dev = " \
			${includedir}/osmocom/trau \
			${libdir}/pkgconfig/libosmotrau.pc \
			${libdir}/libosmotrau${SOLIBSDEV} \
			"
