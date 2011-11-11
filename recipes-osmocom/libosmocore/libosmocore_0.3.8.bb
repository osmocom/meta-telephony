require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ee876c91723267d913a12e76f46bd537700ab9e9"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
