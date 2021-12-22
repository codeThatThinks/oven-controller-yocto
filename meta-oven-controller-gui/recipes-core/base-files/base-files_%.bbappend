FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append := " \
	file://qt5.sh \
	"

dirs755:append = " ${sysconfdir}/profile.d"

do_install:append() {
	install -m 0644 ${WORKDIR}/qt5.sh ${D}${sysconfdir}/profile.d/qt5.sh
}
