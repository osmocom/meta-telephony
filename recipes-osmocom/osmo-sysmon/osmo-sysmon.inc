DESCRIPTION = "Osmocom System Monitoring daemon"
HOMEPAGE = "https://osmocom.org/projects/osmo-sysmon"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "libtalloc libosmocore libosmo-netif libmnl liboping"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig

PACKAGES =+ "osmo-ctrl-client"

FILES_osmo-ctrl-client = " \
                ${bindir}/osmo-ctrl-client \
                "

CONFFILES_osmo-sysmon = "\
		${sysconfdir}/osmocom/osmo-sysmon.cfg \
		"
