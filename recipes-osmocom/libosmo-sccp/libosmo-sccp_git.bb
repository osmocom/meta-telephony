require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "54fa75b85c91bb4bb79960942f63968f6423f6a5"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "${INC_PR}.2"

# we require the tests to link to the static libosmo-sigtran library to
# access symbols not starting with osmo_*
EXTRA_OECONF_remove = "--disable-static"

PACKAGES =+ "osmo-stp"
SYSTEMD_PACKAGES = "osmo-stp"
SYSTEMD_SERVICE_osmo-stp = "osmo-stp.service"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}

do_install_append() {
	install -d ${D}${systemd_system_unitdir}/
	install -d ${D}${sysconfdir}/osmocom/

	install -m 0644 ${S}/doc/examples/osmo-stp.cfg ${D}${sysconfdir}/osmocom/
	install -m 0644 ${S}/contrib/systemd/osmo-stp.service ${D}${systemd_system_unitdir}/
}

FILES_osmo-stp = " \
		${bindir}/osmo-stp \
		${sysconfdir}/osmocom/osmo-stp.cfg \
		"
CONFFILES_osmo-stp = "${sysconfdir}/osmocom/osmo-stp.cfg"
