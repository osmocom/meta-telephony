DESCRIPTION = "An utility library for Open Source Mobile Communications"
DEPENDS = "libosmocore ortp"
DEPENDS_append_geode = "dahdi-linux"
HOMEPAGE = "http://openbsc.gnumonks.org"
LICENSE = "AGPLv3"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

inherit autotools pkgconfig

PACKAGES =+ "libosmotrau libosmotrau-dev"

FILES_libosmotrau = "${libdir}/libosmotrau${SOLIBS}"
FILES_libosmotrau-dev = " \
			${includedir}/osmocom/trau \
			${libdir}/pkgconfig/libosmotrau.pc \
			${libdir}/libosmotrau${SOLIBSDEV} \
			"
