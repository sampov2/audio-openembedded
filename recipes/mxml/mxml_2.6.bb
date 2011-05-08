DESCRIPTION = "Mini-XML is a small XML library that you can use to read and write XML and XML-like data files in your application without requiring large non-standard libraries."
HOMEPAGE = "http://www.minixml.org/"
LICENSE = "GPLv3"
DEPENDS = ""

SRC_URI = "http://ftp.easysw.com/pub/mxml/2.6/mxml-2.6.tar.gz \
           file://va_list_fix.patch"

PR = "r14"

SRC_URI[md5sum] = "68977789ae64985dddbd1a1a1652642e"
SRC_URI[sha256sum] = "b0d347da1a0d5a8c9e82f66087d55cfe499728dacae563740d7e733648c69795"

S = "${WORKDIR}/mxml-${PV}"

inherit autotools

