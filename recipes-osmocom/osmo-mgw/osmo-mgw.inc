DESCRIPTION = "Osmocom Media Gateway (MGCP) implementation"
HOMEPAGE = "https://osmocom.org/projects/osmo-mgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-mgw/osmo-mgw.cfg ${D}${sysconfdir}/osmocom/osmo-mgw.cfg
	install -m 0644 ${S}/contrib/systemd/osmo-mgw.service ${D}${systemd_system_unitdir}/
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
