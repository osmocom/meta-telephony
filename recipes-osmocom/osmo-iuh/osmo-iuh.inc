DESCRIPTION = "Osmocom Iuh and HNB-GW implementation"
HOMEPAGE = "https://osmocom.org/projects/osmohnbgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif libosmo-sccp libasn1c lksctp-tools"

INC_PR="r2.${META_TELEPHONY_OSMO_INC}"

# Workaround to oe-core meta/site/* CONFIG_SITE files passed to autoconf forcing unavailability of netinet/sctp.h.
# Patch fixing issue upstream: https://patchwork.openembedded.org/patch/168892/
CACHED_CONFIGUREVARS += "ac_cv_header_netinet_sctp_h=yes"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

PACKAGES =+ "libosmo-ranap libosmo-ranap-dev osmo-hnbgw"
SYSTEMD_PACKAGES = "osmo-hnbgw"
SYSTEMD_SERVICE_osmo-hnbgw = "osmo-hnbgw.service"

FILES_libosmo-ranap = " \
		${libdir}/libosmo-ranap${SOLIBS} \
		"

FILES_libosmo-ranap-dev = " \
		${includedir}/osmocom/ranap \
		${libdir}/pkgconfig/libosmo-ranap.pc \
		${libdir}/libosmo-ranap${SOLIBSDEV} \
		"

FILES_osmo-hnbgw = " \
		${bindir}/osmo-hnbgw \
		${sysconfdir}/osmocom/osmo-hnbgw.cfg \
		"
CONFFILES_osmo-hnbgw = "${sysconfdir}/osmocom/osmo-hnbgw.cfg"

ALLOW_EMPTY_${PN} = "1"
