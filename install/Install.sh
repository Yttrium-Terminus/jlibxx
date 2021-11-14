# Configs
INSTALL_DIR="$HOME/JLibXX"

#
# Installs the current version of the JLibXX library.
#
# Usage:
# Install.sh [<install_dir>]
# Install.sh -h
# Install.sh -v
# Install.sh -u
# Install.sh -d
#
# Options:
# -h, --help			Display this help message.
# -v, --version			Display the current version of the JLibXX library.
# -u, --uninstall		Uninstall the current version of the JLibXX library.

# Install function to git clone the JLibXX library to INSTALL_DIR


if [ "$(uname -m)" = "x86_64" ]; then
    ARCH="x64"
elif [ "$(uname -m)" = "i686" ]; then
    ARCH="x86"
else
    echo "Your architecture is not supported."
    exit 1
fi
if [ "$(uname -s)" = "MINGW32_NT-6.2" ]; then
    echo "This script is not compatible with Windows."
    exit 1
fi
if [ "$(id -u)" != "0" ]; then
    echo "You must be root to run this script."
    exit 1
fi
# Check if the file is being run as root
if [ "$(id -u)" = "0" ]; then
    echo "You are running this script as root."
    echo "This script will install the JLibXX library in $INSTALL_DIR."
    echo "Do you want to continue? (y/n)"
    read -r answer
    if [ "$answer" != "y" ]; then
        echo "Aborting."
        exit 1
    else 

    fi
fi

if [ $# -eq 1 ]; then
	if [ "$1" = "-h" ] || [ "$1" = "--help" ]; then
		echo "Usage:"
		echo "Install.sh [<install_dir>]"
		echo "Install.sh -h"
		echo "Install.sh -v"
		echo "Install.sh -u"
		echo "Install.sh -d"
        echo "Install.sh --ssh"
		exit 0
	elif [ "$1" = "-v" ] || [ "$1" = "--version" ]; then
		echo "JLibXX version 1.0.0"
		exit 0
	elif [ "$1" = "-u" ] || [ "$1" = "--uninstall" ]; then
		if [ -d "$INSTALL_DIR" ]; then
			rm -rf "$INSTALL_DIR"
			echo "Successfully uninstalled JLibXX."
			exit 0
		else
			echo "The JLibXX directory does not exist."
			exit 1
		fi
	elif [ "$1" = "-d" ]; then
		if [ -d "$INSTALL_DIR" ]; then
			echo "The JLibXX directory already exists."
			exit 1
		else
			mkdir "$INSTALL_DIR"
			echo "Successfully created JLibXX directory."
			exit 0
		fi
    elif [ "$1" = "--java" ]; then
        if [ -d "/Library/Java/JavaVirtualMachines/jdk-11.0.2.jdk/Contents/Home" ]; then
            echo "Java 11 is installed."
            exit 0
        else
            echo "Java 11 is not installed."
            exit 1
        fi
    # ssh pull the git repository
    elif [ "$1" = "--ssh" ]; then
        if [ -d "$INSTALL_DIR" ]; then
            echo "The JLibXX directory already exists."
            exit 1
        else
            git clone https://github.com/exoad/jlibxx.git "$INSTALL_DIR"
	else
		INSTALL_DIR="$1"
        git clone https://github.com/exoad/jlibxx.git "$INSTALL_DIR"
	fi
fi
