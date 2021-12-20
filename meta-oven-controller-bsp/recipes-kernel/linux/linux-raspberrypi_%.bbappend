FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append := " \
	file://display.cfg \
	file://git/arch/arm/boot/dts/overlays/oven-controller-overlay.dts \
	file://0001-Add-RGB666-support-required-for-ILI9481-8-bit-DBI-Ty.patch \
	"

KERNEL_DEVICETREE:append = " overlays/oven-controller.dtbo"
