require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "54fa75b85c91bb4bb79960942f63968f6423f6a5"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
