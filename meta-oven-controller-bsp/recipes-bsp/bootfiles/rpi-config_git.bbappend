do_deploy:append() {
	echo "dtoverlay=pwm-2chan,pin=12,func=4,pin2=13,func2=4" >>$CONFIG
	echo "dtoverlay=oven-controller" >>$CONFIG
}
