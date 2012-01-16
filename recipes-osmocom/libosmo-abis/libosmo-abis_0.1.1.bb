require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "55467f0478e37b35cceec3051c645b8a407110bc"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
