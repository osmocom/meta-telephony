DESCRIPTION = "Sofia-SIP is an open-source SIP User-Agent library, compliant with the IETF RFC3261 specification."
HOMEPAGE = "http://sofia-sip.sourceforge.net/"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=03068f550c635f6520e0f0252da412fc"
SECTION = "libs"
DEPENDS = "glib-2.0 openssl"

SRC_URI = "${SOURCEFORGE_MIRROR}/${PN}/${P}.tar.gz"

inherit autotools pkgconfig

PACKAGES += " ${PN}-bin ${PN}-glib"

FILES_${PN}-bin = "${bindir}"
FILES_${PN} = "${libdir}/libsofia-sip-ua.so.*"
FILES_${PN}-dev += "${datadir}/sofia-sip/*.awk"
FILES_${PN}-glib = "${libdir}/libsofia-sip-ua-glib.so.*" 

LEAD_SONAME = "libsofia-sip-ua.so"
