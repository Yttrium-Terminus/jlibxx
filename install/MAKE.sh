#!/usr/bin/env

# DEF VARIABLES
INSTALL_DIR="$HOME/JLibXX"
MAKE_DIR="$HOME/tmp"
_ARCH="Jlibxx"
_DEB="jlibxx"
_WIN32="jlib++"
_WIN="java_stdxx"
_DIST=$(uname -m)
_DIST_A=$(uname -a)
_ARCH_86="cmake -c"
CACHE_DIR="$HOME/jlibxx_cache"
TIME_CACHED=$(date +%s)
FOUND_DIR="$"