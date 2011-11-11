require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "fe05cf5b3980bf4778a21b3d311a835b7e19a704"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PR = "${INC_PR}.5"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
