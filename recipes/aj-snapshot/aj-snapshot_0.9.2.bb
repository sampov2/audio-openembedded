DESCRIPTION = "Aj-snapshot is a small program that can be used to make snapshots of the connections made between JACK and/or ALSA clients."
HOMEPAGE = "http://aj-snapshot.sourceforge.net/"
LICENSE = "GPLv3"
DEPENDS = "jack alsa-lib mxml"

SRC_URI = "http://heanet.dl.sourceforge.net/sourceforge/aj-snapshot/aj-snapshot-0.9.2.tar.bz2"

PR = "r0"

SRC_URI[md5sum] = "d380e4d8c4b229056fda329bd96d75c2"
SRC_URI[sha256sum] = "a6c5340013b40c122d09ff1bd32f3c3ed5f6e3a1505ef27bf0f05d8f236d6b01"

S = "${WORKDIR}/aj-snapshot-${PV}"

inherit autotools

