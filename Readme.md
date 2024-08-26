# oven-controller-yocto

Building embedded Linux for a Raspberry Pi Zero-powered PID reflow oven controller.

Update submodules after clone:
```
git submodule update --init
```

To build the entire image, first launch a development environment:

```
make shell
```

Then inside the docker image, run bitbake:

```
bitbake core-image-base
```
