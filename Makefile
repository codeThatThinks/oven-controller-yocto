USER_ID := $(shell id -u)
GROUP_ID := $(shell id -g)

default: build

docker:
	docker build -t oven-controller-yocto --build-arg USER_ID=${USER_ID} --build-arg GROUP_ID=${GROUP_ID} .

shell: docker
	docker run -i -t --rm -v ${CURDIR}:/home/build/yocto oven-controller-yocto

build: docker

base:
	bitbake core-image-base

.PHONY: docker shell build base
