require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "65a50893d5f9577c17dc4485d585c12d349c8e30"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
