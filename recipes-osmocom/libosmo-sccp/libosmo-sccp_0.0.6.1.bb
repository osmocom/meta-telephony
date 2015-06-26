require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2d2d885bd124b8ae2d3a04f3583a756029820dc0"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
