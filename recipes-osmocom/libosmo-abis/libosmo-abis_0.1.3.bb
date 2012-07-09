require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "e5ae7f52175411a498ed30560624d0abed0feed7"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
