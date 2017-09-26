DESCRIPTION = "Osmocom HLR implementation"
HOMEPAGE = "https://osmocom.org/projects/osmo-hlr"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=73f1eb20517c55bf9493b7dd6e480788"

DEPENDS = "libtalloc libosmocore libosmo-abis sqlite3 sqlite3-native"

INC_PR="r0.${META_TELEPHONY_OSMO_INC}"

inherit autotools pkgconfig systemd

do_compile_append() {
	sqlite3 ${WORKDIR}/hlr.db < ${S}/sql/hlr.sql
}

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/
	install -d ${D}${localstatedir}/lib/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-hlr.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-hlr.service ${D}${systemd_system_unitdir}/
	install -m 0644 ${WORKDIR}/hlr.db ${D}${localstatedir}/lib/osmocom/hlr.db
}

SYSTEMD_SERVICE_${PN} = "${PN}.service"
