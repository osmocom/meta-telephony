require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "882f340b6c394f581f6c32cafefa10c7b57073b9"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
