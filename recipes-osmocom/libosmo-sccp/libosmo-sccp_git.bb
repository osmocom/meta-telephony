require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "54fa75b85c91bb4bb79960942f63968f6423f6a5"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PV = "0.7.0+gitr${SRCPV}"
PR = "${INC_PR}.0"

# we require the tests to link to the static libosmo-sigtran library to
# access symbols not starting with osmo_*
EXTRA_OECONF_remove = "--disable-static"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
