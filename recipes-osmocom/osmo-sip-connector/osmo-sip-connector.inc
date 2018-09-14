DESCRIPTION = "Osmo SIP Connector"
HOMEPAGE = "https://osmocom.org/projects/osmo-sip-conector"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=ccdfc45f78d625db70e70ede679d5ce3"

DEPENDS = "sofia-sip libosmocore"

INC_PR="r1.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

PACKAGECONFIG ??= "\
    ${@bb.utils.filter('DISTRO_FEATURES', 'systemd', d)} \
    "
PACKAGECONFIG[systemd] = "--with-systemdsystemunitdir=${systemd_system_unitdir},--without-systemdsystemunitdir"


SYSTEMD_SERVICE_${PN} = "${PN}.service"
CONFFILES_osmo-sip-connector = "${sysconfdir}/osmocom/osmo-sip-connector.cfg"
