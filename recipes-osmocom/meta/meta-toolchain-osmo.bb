#TOOLCHAIN_TARGET_OSMOTASK ?= "task-core-standalone-osmo-sdk-target task-core-standalone-osmo-sdk-target-dbg"
TOOLCHAIN_TARGET_OSMOTASK ?= "task-core-standalone-osmo-sdk-target"
TOOLCHAIN_TARGET_TASK = "${TOOLCHAIN_TARGET_OSMOTASK}"
TOOLCHAIN_OUTPUTNAME = "${SDK_NAME}-toolchain-osmo-${DISTRO_VERSION}"
PROVIDES = "meta-toolchain-sdk"
require recipes-core/meta/meta-toolchain.bb
