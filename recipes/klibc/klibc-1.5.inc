require klibc-common.inc

SRC_URI += "file://fstype-sane-vfat-and-jffs2-for-1.5.patch \
            file://modprobe.patch \
            file://losetup.patch \
            file://dash_readopt.patch \
            file://wc.patch \
            file://staging.patch \
            file://klibc_kexecsyscall.patch \
            "

KLIBC_FETCHDIR = "1.5"

SRC_URI[md5sum] = "481dfdef7273f2cc776c2637f481f017"
SRC_URI[sha256sum] = "27000ba4bc73a5977502b27d7036df24dd6ab94a1c33b8f5d6d54ba62772f0c7"

do_install_append() {
        install -m 755 usr/utils/${KLIBC_UTILS_VARIANT}/insmod ${D}${base_bindir}
}