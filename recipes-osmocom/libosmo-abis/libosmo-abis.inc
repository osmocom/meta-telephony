DESCRIPTION = "An utility library for Open Source Mobile Communications"
HOMEPAGE = "https://osmocom.org/projects/libosmo-abis"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"
INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

DEPENDS = "libosmocore ortp libtalloc"
DEPENDS_append_geode = "dahdi-linux"

inherit autotools pkgconfig

PACKAGES =+ "libosmotrau libosmotrau-dev"

FILES_libosmotrau = "${libdir}/libosmotrau${SOLIBS}"
FILES_libosmotrau-dev = " \
			${includedir}/osmocom/trau \
			${libdir}/pkgconfig/libosmotrau.pc \
			${libdir}/libosmotrau${SOLIBSDEV} \
			"
