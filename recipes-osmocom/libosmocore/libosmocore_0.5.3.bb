require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "335aedabf204ac025a79801c15c8488d35cc9981"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
