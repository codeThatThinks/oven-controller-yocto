SUMMARY = "Open Sans fonts"
HOMEPAGE = "https://github.com/googlefonts/opensans"
DESCRIPTION = "Open Sans is a humanist sans serif typeface designed by Steve \
Matteson, Type Director of Ascender Corp. This version contains the complete \
897 character set, which includes the standard ISO Latin 1, Latin CE, Greek \
and Cyrillic character sets. Open Sans was designed with an upright stress, \
open forms and a neutral, yet friendly appearance. It was optimized for print, \
web, and mobile interfaces, and has excellent legibility characteristics in \
its letterforms."
SECTION = "x11/fonts"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://OFL.txt;md5=925fdc2893725d6f20ee2830a9829569"

inherit allarch fontcache

FONT_PACKAGES = "${PN}"

SRC_URI = "git://github.com/googlefonts/opensans;branch=main"
SRCREV = "ebedbda589fe5bd861b02325aca98c86ad845251"

S = "${WORKDIR}/git"

do_install () {
        install -d ${D}${datadir}/fonts/ttf
        for i in fonts/ttf/*.ttf; do
                install -m 644 $i ${D}${datadir}/fonts/ttf
        done
}

FILES:${PN} = "${datadir}/fonts"
