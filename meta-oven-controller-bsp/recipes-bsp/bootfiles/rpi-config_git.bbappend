do_deploy:append() {
	echo "dtoverlay=pwm-2chan,pin=12,func=0,pin2=13,func2=0" >>$CONFIG
	echo "dtoverlay=oven-controller" >>$CONFIG
}
