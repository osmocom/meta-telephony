require ${PN}.inc

S = "${WORKDIR}/git"
SRCREV = "70fcbda6dd733a503e9a046e01986d8bfc2e2bb2"
SRC_URI = "git://git.osmocom.org/libosmocore.git;protocol=git;nobranch=1"
PV = "0.9.0+gitr${SRCPV}"
PR = "r1"

PACKAGES =+ "libosmoctrl libosmocodec libosmogb libosmogsm libosmovty osmo-arfcn osmo-auc-gen"
FILES_libosmoctrl = "${libdir}/libosmoctrl${SOLIBS}"
FILES_libosmocodec = "${libdir}/libosmocodec${SOLIBS}"
FILES_libosmogb = "${libdir}/libosmogb${SOLIBS}"
FILES_libosmogsm = "${libdir}/libosmogsm${SOLIBS}"
FILES_libosmovty = "${libdir}/libosmovty${SOLIBS}"
FILES_osmo-arfcn = "${bindir}/osmo-arfcn"
FILES_osmo-auc-gen = "${bindir}/osmo-auc-gen"

# Requires fix for upgrades
RREPLACES_libosmocore = "DONOTREPLACElibosmocore"
RREPLACES_libosmoctrl = "DONOTREPLACElibosmocore"
RREPLACES_libosmocodec = "DONOTREPLACElibosmocore"
RREPLACES_libosmogb = "DONOTREPLACElibosmocore"
RREPLACES_libosmogsm = "DONOTREPLACElibosmocore"
RREPLACES_libosmovty = "DONOTREPLACElibosmocore"

EXTRA_OECONF += "--disable-pcsc"
