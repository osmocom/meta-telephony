DESCRIPTION = "Osmocom HNB-GW implementation"
HOMEPAGE = "https://osmocom.org/projects/osmohnbgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif libosmo-sccp osmo-iuh libasn1c lksctp-tools osmo-mgw"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

# Workaround to oe-core meta/site/* CONFIG_SITE files passed to autoconf forcing unavailability of netinet/sctp.h.
# Patch fixing issue upstream: https://patchwork.openembedded.org/patch/168892/
CACHED_CONFIGUREVARS += "ac_cv_header_netinet_sctp_h=yes"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

do_install_append() {
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
}

SYSTEMD_SERVICE_${PN} = "${PN}.service"

CONFFILES_osmo-hnbgw = "${sysconfdir}/osmocom/osmo-hnbgw.cfg"
