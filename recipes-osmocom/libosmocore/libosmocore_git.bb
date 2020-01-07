require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "2862f9082ed4f16383a134e1112610d76ad91bf0"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git;nobranch=1"
PV = "1.3.0+gitr${SRCPV}"
PR = "${INC_PR}.0"

PACKAGES =+ "libosmoctrl libosmocodec libosmogb libosmogsm libosmovty osmo-arfcn osmo-auc-gen osmo-config-merge"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"
FILES_libosmocodec = "${libdir}/libosmocodec${SOLIBS}"
FILES_libosmogb = "${libdir}/libosmogb${SOLIBS}"
FILES_libosmogsm = "${libdir}/libosmogsm${SOLIBS}"
FILES_libosmovty = "${libdir}/libosmovty${SOLIBS}"
FILES_osmo-arfcn = "${bindir}/osmo-arfcn"
FILES_osmo-auc-gen = "${bindir}/osmo-auc-gen"
FILES_osmo-config-merge = "${bindir}/osmo-config-merge"

# Requires fix for upgrades
RREPLACES_libosmocore = "DONOTREPLACElibosmocore"
RREPLACES_libosmoctrl = "DONOTREPLACElibosmocore"
RREPLACES_libosmocodec = "DONOTREPLACElibosmocore"
RREPLACES_libosmogb = "DONOTREPLACElibosmocore"
RREPLACES_libosmogsm = "DONOTREPLACElibosmocore"
RREPLACES_libosmovty = "DONOTREPLACElibosmocore"

EXTRA_OECONF += "--disable-pcsc"

# OS#4062: Some gcc version (< 7.3.0) on ARM generate wrong code for __thread
# variables that crash at runtime. It seems, due to some unknown reason, that we
# are not affected by this bug with toolchain from poky pyro (6.4.0). However,
# libosmocore as of e188b8cd98f599468fbb200c7d590de955daf761 applies some
# CFLAGS="-mtls-dialect=gnu2" to workaround the issue automatically. But same
# toolchain contains an "ld" that crashes when those flags are applied.
# Fortunately, libosmocore provides a way to disable the workaround, and since
# we are not affected by the bug, we are fine with that. If the toolchain had
# the TLS runtime bug, then we'd had to build with -O0. Can be probably dropped
# once we move to newer toolchain.
EXTRA_OECONF +=  "--disable-detect-tls-gcc-arm-bug"
