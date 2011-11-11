require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "ef8fc3bf28634d361adeec5490f807efb0ab3341"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
