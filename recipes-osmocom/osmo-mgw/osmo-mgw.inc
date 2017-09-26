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
}

SYSTEMD_SERVICE_osmo-mgw = "osmo-bsc-mgcp.service"
