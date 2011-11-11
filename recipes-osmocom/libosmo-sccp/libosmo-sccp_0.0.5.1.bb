require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "8be06bc2885460d6a6ed7c9daa7df8ab8f02a2dc"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
