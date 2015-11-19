require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "46c2945af2f7d6741fdba7185241845f1d2c7421"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
