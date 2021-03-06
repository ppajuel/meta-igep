require recipes-bsp/u-boot/u-boot.inc

DEFAULT_PREFERENCE = "-1"
# Set as default for following machines
DEFAULT_PREFERENCE_igep00x0 = "1"
DEFAULT_PREFERENCE_igep0033 = "1"

# To build u-boot for your machine, provide the following lines in
# your machine config, replacing the assignments as appropriate for
# your machine.
# UBOOT_MACHINE = "machine_config"
# UBOOT_ENTRYPOINT = "0x80008000"
# UBOOT_LOADADDRESS = "0x80008000"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1707d6db1d42237583f50183a5651ecb"

# This revision corresponds to the tag "v2017.07" from 2017-07-30
# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "19d1f1a2f3ccfbf85125150f7876ce22714b38bd"

PR = "r1"

SRC_URI = 	"git://git.denx.de/u-boot.git;branch=master;protocol=git \
		file://0001-igep00x0-merge-igep0020-and-igep0030-defconfigs-to-i.patch"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
