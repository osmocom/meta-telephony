require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "8264e09ca2f3bd93eba5eefa342267f303085629"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.0"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
