DESCRIPTION = "Osmocom Media Gateway (MGCP) implementation"
HOMEPAGE = "https://osmocom.org/projects/osmo-mgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif"

INC_PR="r3.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

# StateDirectory requires systemd >= v235, but poky pyro ships with v232 (SYS#6340):
do_install_append() {
	sed -i '/^StateDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
	sed -i '/^WorkingDirectory=/d' "${D}${systemd_system_unitdir}/${PN}.service"
}

PACKAGES =+ "libosmo-mgcp libosmo-mgcp-dev libosmo-mgcp-client libosmo-mgcp-client-dev"
SYSTEMD_SERVICE_osmo-mgw = "osmo-mgw.service"

FILES_libosmo-mgcp = "${libdir}/libosmo-mgcp${SOLIBS}"
FILES_libosmo-mgcp-dev = " \
			 ${includedir}/osmocom/mgcp \
			 ${libdir}/pkgconfig/libosmo-mgcp.pc \
			 ${libdir}/libosmo-mgcp${SOLIBSDEV} \
			 "

FILES_libosmo-mgcp-client = "${libdir}/libosmo-mgcp-client${SOLIBS}"
FILES_libosmo-mgcp-client-dev = " \
				${includedir}/osmocom/mgcp_client \
				${libdir}/pkgconfig/libosmo-mgcp-client.pc \
				${libdir}/libosmo-mgcp-client${SOLIBSDEV} \
				"

CONFFILES_osmo-mgw = "${sysconfdir}/osmocom/osmo-mgw.cfg"
