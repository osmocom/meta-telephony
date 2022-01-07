DESCRIPTION = "Osmocom Iuh implementation"
HOMEPAGE = "https://osmocom.org/projects/osmohnbgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif libosmo-sccp libasn1c lksctp-tools"

INC_PR="r3.${META_TELEPHONY_OSMO_INC}"

# Workaround to oe-core meta/site/* CONFIG_SITE files passed to autoconf forcing unavailability of netinet/sctp.h.
# Patch fixing issue upstream: https://patchwork.openembedded.org/patch/168892/
CACHED_CONFIGUREVARS += "ac_cv_header_netinet_sctp_h=yes"

inherit autotools pkgconfig

PACKAGES =+ " \
		libosmo-hnbap libosmo-hnbap-dev \
		libosmo-ranap libosmo-ranap-dev \
		libosmo-rua libosmo-rua-dev \
		libosmo-sabp libosmo-sabp-dev \
		"

FILES_libosmo-hnbap = " \
		${libdir}/libosmo-hnbap${SOLIBS} \
		"

FILES_libosmo-hnbap-dev = " \
		${includedir}/osmocom/hnbap \
		${libdir}/pkgconfig/libosmo-hnbap.pc \
		${libdir}/libosmo-hnbap${SOLIBSDEV} \
		"

FILES_libosmo-ranap = " \
		${libdir}/libosmo-ranap${SOLIBS} \
		"

FILES_libosmo-ranap-dev = " \
		${includedir}/osmocom/ranap \
		${libdir}/pkgconfig/libosmo-ranap.pc \
		${libdir}/libosmo-ranap${SOLIBSDEV} \
		"

FILES_libosmo-rua = " \
		${libdir}/libosmo-rua${SOLIBS} \
		"

FILES_libosmo-rua-dev = " \
		${includedir}/osmocom/rua \
		${libdir}/pkgconfig/libosmo-rua.pc \
		${libdir}/libosmo-rua${SOLIBSDEV} \
		"

FILES_libosmo-sabp = " \
		${libdir}/libosmo-sabp${SOLIBS} \
		"

FILES_libosmo-sabp-dev = " \
		${includedir}/osmocom/sabp \
		${libdir}/pkgconfig/libosmo-sabp.pc \
		${libdir}/libosmo-sabp${SOLIBSDEV} \
		"

ALLOW_EMPTY_${PN} = "1"
