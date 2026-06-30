#!/bin/bash

cd "$1"

ROOT="/workspaces/DSA-Deepesh"

# create build folder
mkdir -p "$ROOT/build"

# compile
javac -d "$ROOT/build" "$2"

# get class name
CLASS_NAME=$(basename "$2" .java)

# run
java -cp "$ROOT/build" "$CLASS_NAME" < "$ROOT/TakeYouForward/input.txt" > "$ROOT/TakeYouForward/output.txt"