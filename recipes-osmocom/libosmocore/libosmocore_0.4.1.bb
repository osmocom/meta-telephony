require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "72bd4eb3b9e674d771d911e27cacb45468d51487"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
