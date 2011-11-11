require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "7e1a622124a6ca6c98e1f3170bf65649ad4321d9"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
