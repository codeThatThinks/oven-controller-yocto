SUMMARY = "Oven Controller Touchscreen GUI"
DESCRIPTION = "This recipe builds the Qt5 touchscreen GUI for the Oven Controller."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase"

SRC_URI = "git://github.com/vpapadopou/qt-simple-calculator;branch=master \
           file://oven-controller-gui-init"
SRCREV = "1af09d43f9a41ad3136a4fac9db63b9542692f91"

S = "${WORKDIR}/git"

do_install:append() {
    install -d ${D}/opt/oven-controller-gui/
    install -m 0755 simpleCalculator ${D}/opt/oven-controller-gui/oven-controller-gui

    if ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', 'true', 'false', d)}; then
        install -d ${D}${sysconfdir}/init.d/
        install -m 0755 ${WORKDIR}/oven-controller-gui-init ${D}${sysconfdir}/init.d/oven-controller-gui.sh
    fi
}

FILES:${PN} += "/opt/oven-controller-gui/oven-controller-gui"

INITSCRIPT_NAME = "oven-controller-gui.sh"

inherit qmake5
