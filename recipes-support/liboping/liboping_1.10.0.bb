SUMMARY = "C library to generate ICMP echo requests, better known as 'ping packets'"
HOMEPAGE = "https://noping.cc/"
SECTION = "libs"
LICENSE = "LGPLv2.1+"

SRC_URI = "https://noping.cc/files/liboping-${PV}.tar.gz"
LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c"

SRC_URI[md5sum] = "3a11b18a92b651225da10108242f71a4"
SRC_URI[sha256sum] = "c206b05743d0730814be3115b48abd0b00016677525153c78730da307aba0846"

EXTRA_OECONF += "--without-ncurses --without-perl-bindings"

inherit autotools pkgconfig
