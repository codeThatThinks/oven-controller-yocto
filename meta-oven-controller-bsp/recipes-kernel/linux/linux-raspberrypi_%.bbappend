FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append := " \
	file://display.cfg \
	file://git/arch/arm/boot/dts/overlays/oven-controller-overlay.dts \
	"

KERNEL_DEVICETREE:append = " overlays/oven-controller.dtbo"
