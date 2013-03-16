DESCRIPTION = "Task for the meta-telephony layer. This is to build everything"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
ALLOW_EMPTY_${PN} = "1"
PR = "r2"

DEPENDS = "\
        libosmo-abis \
        libosmo-sccp \
        libosmocore \
        openbsc \
        task-osmocom \
        openggsn \
        misdn-utils \
        dahdi-linux \
        dahdi-tools \
        lcr \
        asterisk \
        libgsm \
        ortp \
        libdbi \
        libdbi-drivers \
    "

