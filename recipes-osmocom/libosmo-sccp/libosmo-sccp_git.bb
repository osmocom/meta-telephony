require ${PN}.inc

DEPENDS += " libosmo-netif lksctp-tools "
S = "${WORKDIR}/git"
SRCREV = "8e708d1f2da1b187f631bf08172a5194a85b1a23"
SRC_URI = "git://git.osmocom.org/libosmo-sccp.git;protocol=git"
PR = "${INC_PR}.1"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
