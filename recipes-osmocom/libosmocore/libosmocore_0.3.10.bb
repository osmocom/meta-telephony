require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "c7ddbe63da535e62f9a10444f8966bf0a6565a74"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git"
PR = "${INC_PR}.2"

# because "${WORKDIR}/git" is not a git repo, it can't figure out the version
do_configure_prepend() {
    echo "${PV}" > ${S}/.tarball-version
}
