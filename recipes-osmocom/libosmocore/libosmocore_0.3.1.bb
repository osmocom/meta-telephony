require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ee50081daa3a80586f3044056517337a8e8fac9f"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
