DESCRIPTION = "GSM Audio Library"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=fc1372895b173aaf543a122db37e04f5"

SRC_URI = "\
    http://www.quut.com/gsm/gsm-${PV}.tar.gz \
    file://0001-Configure-Makefile.patch \
    file://0002-Add-defines-to-c.patch \
    file://0003-Use-gsm_config.-header-instead-of-config.h.patch \
    file://0004-Add-includes.patch \
    file://0005-Change-compiler-warnings.patch \
"

SRC_URI[md5sum] = "4cbb4e7b73842de3d12d30b0d74200d4"
SRC_URI[sha256sum] = "5814a16a30b3c026871b3739812dc4a2a84299331182c987da1c212c93e9352c"

S = "${WORKDIR}/gsm-1.0-pl14/"

CFLAGS += "-c -g -fPIC -Wall -D_GNU_SOURCE -D_REENTRANT -DNeedFunctionPrototypes=1 -DWAV49 -I./inc"

PARALLEL_MAKE = ""

do_compile(){
    unset LD
    oe_runmake CCFLAGS="${CFLAGS}" CC="${CC}"
}

do_install(){
    oe_libinstall -a -C lib libgsm ${D}${libdir}
    oe_libinstall -so -C lib libgsm ${D}${libdir}
    install -d ${D}${includedir}/gsm
    install -m 0644 ${S}/inc/gsm.h ${D}${includedir}/gsm/
    cd ${D}${includedir}
    ln -s gsm/gsm.h gsm.h
}
