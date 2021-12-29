FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append := " \
	file://display.cfg \
	file://git/arch/arm/boot/dts/overlays/oven-controller-overlay.dts \
	file://0001-Add-RGB666-support-required-for-ILI9481-8-bit-DBI-Ty.patch \
	file://0001-Adjust-ILI9481-power-and-gamma-settings.patch \
	"

KERNEL_DEVICETREE:append = " overlays/pwm-2chan.dtbo overlays/oven-controller.dtbo"
KERNEL_MODULE_AUTOLOAD:append = " i2c-dev"
