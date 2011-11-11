require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "346374a001ba42e8d3612fefd76a061f4d494a34"
SRC_URI = "git://git.osmocom.org/libosmo-abis.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
