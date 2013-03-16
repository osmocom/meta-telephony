#
# Copyright (C) 2007 OpenedHand Ltd.
#

DESCRIPTION = "Software Development Kit for Osmocom devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r4"

ALLOW_EMPTY_${PN} = "1"

# TODO: We need to rename this task to packagegroup but for now we
# will need to skip this test.
INSANE_SKIP_${PN} += "dev-deps"

require task-sdk-osmo.inc

PACKAGES = "${PN} ${PN}-dbg"

RDEPENDS_${PN} = "\
    task-core-standalone-sdk-target \
    ${SDK-OSMO} \
    ${SDK-EXTRAS}"
