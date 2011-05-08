#Angstrom minimalist image
#gives you a small image with ssh access

ANGSTROM_EXTRA_INSTALL ?= ""
DISTRO_SSH_DAEMON ?= "dropbear"

IMAGE_PREPROCESS_COMMAND = "create_etc_timestamp"

PR="r8"

IMAGE_INSTALL = "task-boot \
            util-linux-ng-mount util-linux-ng-umount \
            ${DISTRO_SSH_DAEMON} \
            ${ANGSTROM_EXTRA_INSTALL} \
            angstrom-version "

# ${SPLASH}

IMAGE_INSTALL += "screen "

IMAGE_INSTALL += "libjack jack-server jack-examples "
IMAGE_INSTALL += "aj-snapshot " 
IMAGE_INSTALL += "libsndfile1 "
IMAGE_INSTALL += "fluidsynth fluidsynth-bin "
IMAGE_INSTALL += "alsa-utils-aconnect alsa-utils-alsamixer alsa-utils-amixer alsa-utils-aplay alsa-utils-aseqdump alsa-utils-midi"

export IMAGE_BASENAME = "jari-image"
IMAGE_LINGUAS = ""

inherit image

