SUMMARY = "Oven Controller Touchscreen GUI"
DESCRIPTION = "This recipe builds the Qt5 touchscreen GUI for the Oven Controller."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/vpapadopou/qt-simple-calculator;branch=master"
SRCREV = "1af09d43f9a41ad3136a4fac9db63b9542692f91"

S = "${WORKDIR}/git"

do_install:append() {
    install -d ${D}/opt/oven-controller-gui/
    install -m 0755 simpleCalculator ${D}/opt/oven-controller-gui/
}

FILES:${PN} += "/opt/oven-controller-gui/simpleCalculator"

inherit qmake5
