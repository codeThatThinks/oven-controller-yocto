FROM ubuntu:20.04

ARG USER_ID
ARG GROUP_ID

SHELL ["/bin/bash", "-c"]

RUN apt-get update && DEBIAN_FRONTEND="noninteractive" apt-get -y install tzdata
RUN apt-get update && apt-get install -y \
	gawk \
	wget \
	git-core \
	diffstat \
	unzip \
	texinfo \
	gcc-multilib \
	build-essential \
	chrpath \
	socat \
	cpio \
	python \
	python3 \
	python3-pip \
	python3-pexpect \
	xz-utils \
	debianutils \
	debianutils \
	iputils-ping \
	python3-git \
	python3-jinja2 \
	libegl1-mesa \
	libsdl1.2-dev \
	pylint3 \
	locales \
	liblz4-tool \
	zstd \
	screen \
	libncurses-dev \
	nano

RUN echo "en_US.UTF-8 UTF-8" > /etc/locale.gen && locale-gen
ENV LANG en_US.utf8

RUN groupadd -f --gid $GROUP_ID build
RUN useradd --uid $USER_ID --gid $GROUP_ID -ms /bin/bash build
USER build
RUN mkdir /home/build/yocto
WORKDIR /home/build/yocto
ENTRYPOINT source poky/oe-init-build-env . && /bin/bash
