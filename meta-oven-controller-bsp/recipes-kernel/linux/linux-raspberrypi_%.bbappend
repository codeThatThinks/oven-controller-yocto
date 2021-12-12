FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append := " \
	file://display.cfg \
	file://oven-controller-overlay.dts;subdir=arch/arm/boot/dts/overlays \
	"

KERNEL_DEVICETREE += "overlays/oven-controller-overlay.dtbo"
