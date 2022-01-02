do_deploy:append() {
	echo "dtoverlay=i2c-gpio,i2c_gpio_sda=18,i2c_gpio_scl=15,bus=2" >>$CONFIG
	echo "dtoverlay=pwm-2chan,pin=12,func=4,pin2=13,func2=4" >>$CONFIG
	echo "dtoverlay=oven-controller" >>$CONFIG
}
