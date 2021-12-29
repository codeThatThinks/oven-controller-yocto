DESCRIPTION = "This library provides gpio access via the standard linux sysfs interface"
HOMEPAGE = "https://github.com/vitiral/gpio"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=54f92f5eb3aa8bf72086592f10e17659"

SRC_URI = "\
	git://github.com/codeThatThinks/gpio.git;branch=master \
"

SRCREV = "46941eb8c43caa5c0c363ccbd2ea5d24271c7ff3"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "^rpi$"

inherit setuptools3
