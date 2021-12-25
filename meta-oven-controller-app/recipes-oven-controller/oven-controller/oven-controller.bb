SUMMARY = "Oven Controller application"
DESCRIPTION = "This recipe builds the Python application code for the Oven Controller."
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS_${PN} = "python3-modules python3-pyqt5"
RDEPENDS_${PN} = "python3-modules python3-pyqt5 python3-smbus2"

SRC_URI = "git://github.com/codeThatThinks/oven-controller-app;branch=master \
           file://oven-controller-init"
SRCREV = "39f4cbb9eea8a525556e1f7e23976851d0ab3038"

S = "${WORKDIR}/git"

do_install() {
    install -d ${D}/opt/oven-controller/
    install -m 0755 ${S}/ovencontroller/* ${D}/opt/oven-controller/

    if ${@bb.utils.contains('DISTRO_FEATURES', 'sysvinit', 'true', 'false', d)}; then
        install -d ${D}${sysconfdir}/init.d/
        install -m 0755 ${WORKDIR}/oven-controller-init ${D}${sysconfdir}/init.d/oven-controller.sh
    fi
}

FILES:${PN} += "/opt/oven-controller"

INITSCRIPT_NAME = "oven-controller.sh"