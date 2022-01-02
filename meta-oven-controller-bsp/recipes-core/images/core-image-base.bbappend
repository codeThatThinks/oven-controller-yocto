KERNEL_DEVICETREE:append = " overlays/i2c-gpio.dtbo overlays/pwm-2chan.dtbo overlays/oven-controller.dtbo"
IMAGE_INSTALL:append = " nano openssh openssh-sftp-server evtest i2c-tools"
