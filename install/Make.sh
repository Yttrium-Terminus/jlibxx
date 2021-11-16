# A custom make file for this entire repository
# This file runs when Install.sh calls this file to be run after the repository has been pulled
# NEVER EVER RUN THIS FILE MANUALLY
# ALWAYS LET INSTALL.SH RUN THE FILE
#
# To run this script via Install.sh if the automatic installation fails:
#
# Install.sh --make
#
# This will atempt to run this script and generate the necessary components

INSTALL_DIR="$HOME/JLibXX"

echo -e "\e[31mIF THIS FILE WAS RUN MANUALLY, PLEASE UNISTALL JLIBXX AND RESTART INSTALLATION PROCESS AGAIN" ; echo ;
