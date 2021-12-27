DESCRIPTION = "This library provides gpio access via the standard linux sysfs interface"
HOMEPAGE = "https://github.com/vitiral/gpio"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=54f92f5eb3aa8bf72086592f10e17659"

PYPI_PACKAGE = "gpio"
inherit pypi

inherit setuptools3

COMPATIBLE_MACHINE = "^rpi$"

RDEPENDS:${PN} = "\
    python3-multiprocessing \
"

SRC_URI[md5sum] = "e9f30a756fa92961383e2ee01395db5d"
SRC_URI[sha256sum] = "0b8db65f554ad7e6733910ead6560f9800d179a73a3e4e3413e619fc334f8c7b"
