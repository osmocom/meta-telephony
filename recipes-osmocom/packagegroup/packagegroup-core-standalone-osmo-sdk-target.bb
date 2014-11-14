#
# Copyright (C) 2007 OpenedHand Ltd.
#

DESCRIPTION = "Software Development Kit for Osmocom devices"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
PR = "r5"

ALLOW_EMPTY_${PN} = "1"

# TODO: We need to rename this task to packagegroup but for now we
# will need to skip this test.
INSANE_SKIP_${PN} += "dev-deps"

require packagegroup-sdk-osmo.inc

PACKAGES = "${PN} ${PN}-dbg"

RDEPENDS_${PN} = "\
    packagegroup-core-standalone-sdk-target \
    ${SDK-OSMO} \
    ${SDK-EXTRAS}"
