DESCRIPTION = "This library provides gpio access via the standard linux sysfs interface"
HOMEPAGE = "https://github.com/vitiral/gpio"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=54f92f5eb3aa8bf72086592f10e17659"

SRC_URI = "\
	git://github.com/vitiral/gpio.git;branch=master \
	file://0001-Use-multiprocessing-instead-of-threading.patch \
"

SRCREV = "fd8e954321abf2746057f7a4085ba47a5a552e60"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS:${PN} = "\
    python3-multiprocessing \
"

inherit setuptools3
