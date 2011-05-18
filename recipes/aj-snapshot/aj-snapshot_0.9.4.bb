DESCRIPTION = "Aj-snapshot is a small program that can be used to make snapshots of the connections made between JACK and/or ALSA clients."
HOMEPAGE = "http://aj-snapshot.sourceforge.net/"
LICENSE = "GPLv3"
DEPENDS = "jack alsa-lib mxml"

SRC_URI = "http://heanet.dl.sourceforge.net/sourceforge/aj-snapshot/aj-snapshot-${PV}.tar.bz2"

PR = "r0"

SRC_URI[md5sum] = "959166b24f53086013d5009548b32803"
SRC_URI[sha256sum] = "59a9a072336f70d62d8f6343d59d056ef6c579f79b8b19b1a7581893618dee85"

S = "${WORKDIR}/aj-snapshot-${PV}"

inherit autotools

