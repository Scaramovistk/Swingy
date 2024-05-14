#!/bin/bash

set -e

INSTALL_DIR="$HOME/goinfre"
JDK_FOLDER="jdk-22.0.1"
MAVEN_FOLDER="apache-maven-3.9.6"

cd "$INSTALL_DIR"
curl -LO https://download.oracle.com/java/22/latest/jdk-22_linux-x64_bin.tar.gz
curl -LO https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz

tar zxvf jdk-22_linux-x64_bin.tar.gz
tar zxvf apache-maven-3.9.6-bin.tar.gz

rm jdk-22_linux-x64_bin.tar.gz
rm apache-maven-3.9.6-bin.tar.gz

if ! grep -q "$JDK_FOLDER/bin" ~/.zshrc; then
    echo "export PATH=\"$INSTALL_DIR/$JDK_FOLDER/bin:\$PATH\"" >> ~/.zshrc
fi

if ! grep -q "$MAVEN_FOLDER/bin" ~/.zshrc; then
    echo "export PATH=\"$INSTALL_DIR/$MAVEN_FOLDER/bin:\$PATH\"" >> ~/.zshrc
fi

if [ -z "$JAVA_HOME" ] || [[ "$JAVA_HOME" != *"/$JDK_FOLDER"* ]]; then
    echo "export JAVA_HOME=\"$INSTALL_DIR/$JDK_FOLDER\"" >> ~/.zshrc
fi

source ~/.zshrc

# export JAVA_HOME=/Users/gscarama/goinfre/jdk-13.jdk/Contents/Home
# export PATH=/Users/gscarama/goinfre/jdk-13.jdk/Contents/Home/bin