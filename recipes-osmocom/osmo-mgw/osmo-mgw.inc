DESCRIPTION = "Osmocom Media Gateway (MGCP) implementation"
HOMEPAGE = "https://osmocom.org/projects/osmo-mgw"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore libosmo-netif bcg729 libgsm"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

EXTRA_OECONF += "--enable-mgcp-transcoding --with-g729"

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-bsc_mgcp/mgcp.cfg ${D}${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg
	install -m 0644 ${S}/contrib/systemd/osmo-bsc-mgcp.service ${D}${systemd_system_unitdir}/

	install -m 0644 ${S}/doc/examples/osmo-mgw/osmo-mgw.cfg ${D}${sysconfdir}/osmocom/osmo-mgw.cfg
	install -m 0644 ${S}/contrib/systemd/osmo-mgw.service ${D}${systemd_system_unitdir}/
}

PACKAGES =+ " libosmo-legacy-mgcp libosmo-legacy-mgcp-dev libosmo-mgcp libosmo-mgcp-dev libosmo-mgcp-client libosmo-mgcp-client-dev osmo-bsc-mgcp"
SYSTEMD_SERVICE_osmo-mgw = "osmo-mgw.service"
SYSTEMD_SERVICE_osmo-bsc-mgcp = "osmo-bsc-mgcp.service"

FILES_libosmo-legacy-mgcp = "${libdir}/libosmo-legacy-mgcp${SOLIBS}"
FILES_libosmo-legacy-mgcp-dev = " \
				${includedir}/osmocom/legacy_mgcp \
				${libdir}/pkgconfig/libosmo-legacy-mgcp.pc \
				${libdir}/libosmo-legacy-mgcp${SOLIBSDEV} \
				"

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

FILES_osmo-bsc-mgcp = " \
			${bindir}/osmo-bsc_mgcp \
			${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg \
			${systemd_unitdir}/system/osmo-bsc-mgcp.service \
			"
CONFFILES_osmo-bsc-mgcp = "${sysconfdir}/osmocom/osmo-bsc-mgcp.cfg"

CONFFILES_osmo-mgw = "${sysconfdir}/osmocom/osmo-mgw.cfg"
