DESCRIPTION = "Asterisk is an Open Source PBX and telephony toolkit."
HOMEPAGE = "http://www.asterisk.org/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3aa955c628d43053f8ba9569d173105a"

DEPENDS += "jansson sqlite3 libedit alsa-lib util-linux"

SRC_URI = "\
    http://downloads.asterisk.org/pub/telephony/asterisk/releases/asterisk-${PV}.tar.gz \
    file://0001-Use-pkgconfig-to-find-sdl.patch \
    file://0002-Use-pkgconfig-to-find-libxml2.patch \
    file://asterisk.init.d \
"

SRC_URI[md5sum] = "2fb7d247aacdbb9736c82b133053dfdf"
SRC_URI[sha256sum] = "e8b8d071f783edea82de510194dd272070ffbb7cdb2f5f6b020be5d15b67e8b9"

S = "${WORKDIR}/asterisk-${PV}"

inherit autotools-brokensep pkgconfig useradd update-rc.d

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--system -g asterisk --shell /bin/false asterisk"
GROUPADD_PARAM_${PN} = "--system asterisk"

PACKAGECONFIG ?= "${@bb.utils.contains('DISTRO_FEATURES', 'largefile', 'largefile', '', d)}"
# Optional features
PACKAGECONFIG[dev-mode] = "--enable-dev-mode,--disable-dev-mode"
PACKAGECONFIG[coverage] = "--enable-coverage,--disable-coverage"
PACKAGECONFIG[xmldoc] = "--enable-xmldoc,--disable-xmldoc"
PACKAGECONFIG[largefile] = "--enable-largefile,--disable-largefile"
PACKAGECONFIG[internal-poll] = "--enable-internal-poll,--disable-internal-poll"
PACKAGECONFIG[asteriskssl] = "--enable-asteriskssl,--disable-asteriskssl,openssl"
PACKAGECONFIG[rpath] = "--enable-rpath,--disable-rpath"
# Optional packages
PACKAGECONFIG[bfd] = "--with-bfd,--without-bfd"
PACKAGECONFIG[bluetooth] = "--with-bluetooth,--without-bluetooth,bluez5"
PACKAGECONFIG[backtrace] = "--with-execinfo,--without-execinfo"
PACKAGECONFIG[cap] = "--with-cap,--without-cap,libcap"
PACKAGECONFIG[corosync] = "--with-cpg,--without-cpg,corosync"
PACKAGECONFIG[curses] = "--with-curses,--without-curses,ncurses"
PACKAGECONFIG[crypt] = "--with-crypt,--without-crypt"
PACKAGECONFIG[crypto] = "--with-crypto,--without-crypto"
PACKAGECONFIG[dahdi] = "--with-dahdi,--without-dahdi,dahdi-tools"
# To enable FFMPEG add LICENSE_FLAGS_WHITELIST = "commercial" to your local.conf
PACKAGECONFIG[ffmpeg] = "--with-avcodec,--without-avcodec,libav"
PACKAGECONFIG[gsm] = "--with-gsm,--without-gsm,libgsm"
PACKAGECONFIG[ilbc] = "--with-ilbc,--without-ilbc"
PACKAGECONFIG[gtk2] = "--with-gtk2,--without-gtk2,gtk+"
PACKAGECONFIG[gmime] = "--with-gmime,--without-gmime"
PACKAGECONFIG[openh323] = "--with-h323,--without-h323"
PACKAGECONFIG[hoard] = "--with-hoard,--without-hoard"
PACKAGECONFIG[ical] = "--with-ical,--without-ical"
PACKAGECONFIG[iconv] = "--with-iconv,--without-iconv,libiconv"
PACKAGECONFIG[iksemel] = "--with-iksemel,--without-iksemel,iksemel"
PACKAGECONFIG[imap_tk] = "--with-imap,--without-imap,uw-imap"
PACKAGECONFIG[inotify] = "--with-inotify,--without-inotify"
PACKAGECONFIG[iodbc] = "--with-iodbc,--without-iodbc"
PACKAGECONFIG[isdnnet] = "--with-isdnnet,--without-isdnnet"
# Jack depends on kqeueu
PACKAGECONFIG[jack] = "--with-jack,--without-jack,jack"
PACKAGECONFIG[uriparser] = "--with-uriparser,--without-uriparser"
PACKAGECONFIG[kqueue] = "--with-kqueue,--without-kqueue"
PACKAGECONFIG[ldap] = "--with-ldap,--without-ldap,openldap"
PACKAGECONFIG[libcurl] = "--with-libcurl,--without-libcurl,curl"
PACKAGECONFIG[libxml2] = "--with-libxml2,--without-libxml2,libxml2"
PACKAGECONFIG[libxslt] = "--with-libxslt,--without-libxslt,libxslt"
PACKAGECONFIG[ltdl] = "--with-ltdl,--without-ltdl,libtool"
PACKAGECONFIG[lua] = "--with-lua,--without-lua,lua"
PACKAGECONFIG[misdn] = "--with-misdn,--without-misdn,misdn-utils"
PACKAGECONFIG[mysqlclient] = "--with-mysqlclient,--without-mysqlclient,mariadb"
PACKAGECONFIG[nbs] = "--with-nbs,--without-nbs"
PACKAGECONFIG[ncurses] = "--with-curses,--without-curses,ncurses"
PACKAGECONFIG[neon] = "--with-neon,--without-neon,neon"
PACKAGECONFIG[netsnmp] = "--with-netsnmp,--without-netsnmp,net-snmp"
PACKAGECONFIG[newt] = "--with-newt,--without-newt,libnewt"
PACKAGECONFIG[ogg] = "--with-ogg,--without-ogg,libogg"
PACKAGECONFIG[openr2] = "--with-openr2,--without-openr2"
PACKAGECONFIG[opus] = "--with-opus,--without-opus,libopus"
PACKAGECONFIG[osptk] = "--with-osptk,--without-osptk"
PACKAGECONFIG[oss] = "--with-oss,--without-oss,alsa-oss"
PACKAGECONFIG[pgsql] = "--with-postgres,--without-postgres,postgresql"
PACKAGECONFIG[pjproject] = "--with-pjproject,--without-pjproject,pjproject"
PACKAGECONFIG[popt] = "--with-popt,--without-popt,popt"
PACKAGECONFIG[portaudio] = "--with-portaudio,--without-portaudio,portaudio-v19"
PACKAGECONFIG[pri] = "--with-pri,--without-pri,misdn-utils"
PACKAGECONFIG[pwlib] = "--with-pwlib,--without-pwlib,pwlib"
PACKAGECONFIG[radius] = "--with-radius,--without-radius,radiusclient-ng"
PACKAGECONFIG[resample] = "--with-resample,--without-resample,ncurses"
# Need to enable sdl_images to use sdl
PACKAGECONFIG[sdl] = "--with-sdl,--without-sdl,libsdl"
PACKAGECONFIG[sdl_image] = "--with-SDL_image,--without-SDL_image,libsdl-image"
PACKAGECONFIG[sounds-cache] = "--with-sounds-cache,--without-sounds-cache"
PACKAGECONFIG[spandsp] = "--with-spandsp,--without-spandsp"
PACKAGECONFIG[ss7] = "--with-ss7,--without-ss7"
PACKAGECONFIG[speex] = "--with-speex,--without-speex,speex"
PACKAGECONFIG[speexdsp] = "--with-speexdsp,--without-speexdsp,speexdsp"
PACKAGECONFIG[srtp] = "--with-srtp,--without-srtp"
PACKAGECONFIG[openssl] = "--with-ssl,--without-ssl,openssl"
PACKAGECONFIG[suppserv] = "--with-suppserv,--without-suppserv,misdn-utils"
PACKAGECONFIG[freetds] = "--with-tds,--without-tds"
PACKAGECONFIG[termcap] = "--with-termcap,--without-termcap,libcap"
PACKAGECONFIG[timerfd] = "--with-timerfd,--without-timerfd"
PACKAGECONFIG[tinfo] = "--with-tinfo,--without-tinfo,ncurses"
PACKAGECONFIG[tonezone] = "--with-tonezone,--without-tonezone"
PACKAGECONFIG[unixodbc] = "--with-unixodbc,--without-unixodbc,libodbc"
PACKAGECONFIG[vorbis] = "--with-vorbis,--without-vorbis,libvorbis"
PACKAGECONFIG[vpb] = "--with-vpb,--without-vpb"
PACKAGECONFIG[x11] = "--with-x11,--without-x11,libx11"
PACKAGECONFIG[zlib] = "--with-z,--without-z,zlib"

EXTRA_OECONF += " \
   --with-libedit=${STAGING_INCDIR} \
"

INITSCRIPT_NAME = "asterisk"
INITSCRIPT_PARAMS = "defaults"

do_configure_append() {
    echo "Regenerate the configure scripts"
    for d in ${S}/menuselect; do
        echo " - $d"
        (cd $d; autoreconf -I ${S}/autoconf)
    done

    echo "Starting the build of menuselect"
    cd ${B}/menuselect
    CC="${HOST_CC}" \
    CXX="${HOST_CXX}" \
    LD="" \
    AR="" \
    RANLIB="" \
    CFLAGS="${HOST_CFLAGS}" \
    LDFLAGS="${HOST_LDFLAGS}" \
    ./configure
}

do_install_append() {
    oe_runmake DESTDIR=${D} samples
    install -Dm 0755 ${WORKDIR}/asterisk.init.d ${D}${sysconfdir}/init.d/asterisk
    # Set file permissions and ownerships
    chown -R root:asterisk ${D}${sysconfdir}/asterisk
    chmod -R u=rwX,g=rwX,o= ${D}${sysconfdir}/asterisk
    for x in spool run lib log; do
        chown -R asterisk:asterisk ${D}${localstatedir}/${x}/asterisk
        chmod -R u=rwX,g=rwX,o= ${D}${localstatedir}/${x}/asterisk
    done
}

FILES_${PN} += "\
    /run/asterisk \
    ${datadir}/dahdi/* \
    ${libdir}/hotplug/firmware \
"
FILES_${PN}-dbg += "${libdir}/*/*/.debug"
