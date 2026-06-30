#!/bin/bash

cd "$1"

# create build folder if not exists
mkdir -p /workspaces/DSA-Deepesh/build

# compile to build folder
javac -d /workspaces/DSA-Deepesh/build "$2"

# run from build folder
java -cp /workspaces/DSA-Deepesh/build "${2%.java}" < "../../input.txt" > "../../output.txt"


# chmod +x .vscode/run.sh give permisssion run in terminal