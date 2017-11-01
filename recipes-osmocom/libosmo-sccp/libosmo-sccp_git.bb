require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "6cd8d1243711f4de2f1314c7b87b972572cdec4e"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.8.1+gitr${SRCPV}"
PR = "${INC_PR}.0"

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
