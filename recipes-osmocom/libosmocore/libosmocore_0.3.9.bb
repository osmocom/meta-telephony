require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "d61d517a2e35f482519561bd325652ee7144679a"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
