DESCRIPTION = "Access the hardware PWM of a Raspberry Pi with Python. More \
lightweight than alternatives."
HOMEPAGE = "https://github.com/Pioreactor/rpi_hardware_pwm"
SECTION = "devel/python"
LICENSE = "GPLv3+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37b358b4f853ea8b2bfd5b5a72bb0286"

PYPI_PACKAGE = "rpi_hardware_pwm"
inherit pypi

inherit setuptools3

COMPATIBLE_MACHINE = "^rpi$"

SRC_URI[md5sum] = "e4caac211d43b632c68db68036b04437"
SRC_URI[sha256sum] = "a7e99c9aef16c4c281d87fb3e7f9e019d3103397c2a3bd4c8f80f4d822e6d5da"
