DESCRITOPN = "Osmocom PCAP client (probe) and server (aggregator)"
HOMEPAGE = "https://osmocom.org/"
LICENSE = "AGPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libosmocore zeromq libpcap gnutls"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"

PACKAGES =+ "osmo-pcap-server osmo-pcap-client"

SYSTEMD_PACKAGES = "osmo-pcap-server osmo-pcap-client"
SYSTEMD_SERVICE_osmo-pcap-server = "osmo-pcap-server.service"
SYSTEMD_SERVICE_osmo-pcap-client = "osmo-pcap-client.service"

CONFFILES_osmo-pcap-server = "${sysconfdir}/osmocom/osmo-pcap-server.cfg"
CONFFILES_osmo-pcap-client = "${sysconfdir}/osmocom/osmo-pcap-client.cfg"

EXTRA_OECONF += "--with-pcap-config=no"

do_configure_prepend() {
	export PCAP_LIBS="-lpcap"
}

FILES_osmo-pcap-server = "${bindir}/osmo-pcap-server \
			  ${sysconfdir}/osmocom/osmo-pcap-server.cfg \
			  ${datadir}/osmo-pcap/osmo_pcap_clean_old \
			  "

FILES_osmo-pcap-client = "${bindir}/osmo-pcap-client \
			  ${sysconfdir}/osmocom/osmo-pcap-client.cfg \
			  "
