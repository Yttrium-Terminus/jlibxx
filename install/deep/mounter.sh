# not a standalone script
# shall be only run when an
# internal script calls for the use of this
CACHED_PART="$CACHE_DIR/mount_"
CACHED_PART+="$TIME_CACHED.log"

echo -e "$ARGUMENT" >> "$CACHED_PART"
hexdump -ve '1/1' "%.2x" #compared to xxd which might be used for some later versions