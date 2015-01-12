SUMMARY = "Plugin for gstreamer: dvbmediasink"
SECTION = "multimedia"
LICENSE = "MIT | LGPLv2.1"
LIC_FILES_CHKSUM = "file://src/gstdvbaudiosink.c;md5=f75cb576c08988776c2bc525cdff4382 \
                    file://src/gstdvbvideosink.c;md5=4c4f38110ec1bc426f24f6bf9bccf5ca"

DEPENDS = "gstreamer gst-plugins-base"
RDEPENDS_${PN} = "gst-ffmpeg"

PR = "r12"
SRCREV = "${AUTOREV}"

inherit autotools git-project pkgconfig

do_configure_prepend() {
    touch ${S}/NEWS
    touch ${S}/README
}

BRANCH="master"
SRC_URI = "git://github.com/MOA-2011/dags-gst-plugin-mediasink.git;protocol=git;branch=${BRANCH}"

FILES_${PN} = "${libdir}/gstreamer-0.10/*.so"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la"
FILES_${PN}-staticdev += "${libdir}/gstreamer-0.10/*.a"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
