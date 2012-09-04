# libdbi-drivers OE build file
# Copyright (C) 2005, Koninklijke Philips Electronics NV.  All Rights Reserved
# Released under the MIT license (see packages/COPYING)

DESCRIPTION = "Database Drivers for libdbi"
HOMEPAGE = "http://libdbi-drivers.sourceforge.net/"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d8045f3b8f929c1cb29a1e3fd737b499"
SECTION = "libs"

PROVIDES = "libdbd-sqlite"
DEPENDS = "libdbi sqlite3"

INC_PR = "r1"

SRC_URI = "${SOURCEFORGE_MIRROR}/libdbi-drivers/libdbi-drivers-${PV}.tar.gz"

inherit autotools

PACKAGES += "libdbd-sqlite3"

EXTRA_OECONF = "--with-dbi-incdir=${STAGING_INCDIR} \
                --with-dbi-libdir=${STAGING_LIBDIR} \
                --with-sqlite3 \
                --with-sqlite3-incdir=${STAGING_INCDIR} \
                --with-sqlite3-libdir=${STAGING_LIBDIR} \
                --disable-docs"

FILES_${PN}-dbg += " ${libdir}/dbd/.debug/*.so"
FILES_${PN}-dev += " ${libdir}/dbd/*.la "
FILES_${PN}-staticdev += " ${libdir}/dbd/*.a"

DESCRIPTION_libdbd-sqlite3 =  "SQLite3 database driver for libdbi"
FILES_libdbd-sqlite3 = "${libdir}/dbd/libdbdsqlite3.so"

