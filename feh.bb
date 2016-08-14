DESCRIPTION = "AT command inout"
#DEPENDS = "curl libmodbus sqlite3 jsoncpp gpsd"
#RDEPENDS = "libpthread"
RDEPENDS_${PN} = "curl libx11 libpng libxinerama imlib2"

SECTION = "libs"
LICENSE = "MIT"
#PV = "1"
#PR = "r0"


SRCREV = "${AUTOREV}"

SRC_URI = " \
    git://github.com/derf/feh.git;protocol=https;branch=master \
    file://copyright \
"

#SRC_URI = " \
#    git://git.oschina.net/tonyho/u-boot-2015.04.git;protocol=https;branch=master \
# "


LIC_FILES_CHKSUM = "file://${WORKDIR}/copyright;md5=3dd6192d306f582dee7687da3d8748ab"
S = "${WORKDIR}/git"

do_configure () {
}

do_compile () {
    make
}

do_install () {
    install -d ${D}
    install -d ${D}${bindir}/
    install -m 0755 ${S}/src/feh ${D}${bindir}/
    install -d ${D}/usr/share
    install -d ${D}/usr/share/${BPN}
    install -d ${D}/usr/share/${BPN}/fonts
    install -d ${D}/usr/share/${BPN}/images
    cp ${S}/share/fonts/* ${D}/usr/share/${BPN}/fonts/
    cp ${S}/share/images/* ${D}/usr/share/${BPN}/images/
}

#do_install () {
#	install -d ${D}${bindir}/
#	install -m 0755 ${S}/atinout ${D}${bindir}/
#}

#FILES_${PN} = "${bindir}/atinout \
#"

