require ${PN}.inc

PR = "${INC_PR}.0"

SRC_URI[md5sum] = "9f47b960e225eede2cdeaabf7d22f59f"
SRC_URI[sha256sum] = "43d2eacd573a4faff296fa925dd97fbf2aedbf1ae35c6263478210c61004c854"

SRC_URI += "file://0001-build-resolve-link-failure-in-sqlite3-module.patch \
	file://disable-tests.patch \
	file://memory-corruption-fixes.patch"
