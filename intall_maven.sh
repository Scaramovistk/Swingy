#!/bin/bash

set -e

INSTALL_DIR="$HOME/goinfre"

cd "$INSTALL_DIR"
curl -LO https://download.oracle.com/java/22/latest/jdk-22_macos-aarch64_bin.tar.gz
curl -LO https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.tar.gz

tar zxvf jdk-22_macos-aarch64_bin.tar.gz
tar zxvf apache-maven-3.9.6-bin.tar.gz

rm jdk-22_macos-aarch64_bin.tar.gz
rm apache-maven-3.9.6-bin.tar.gz

if ! grep -q "jdk-22.0.1.jdk/Contents/Home/bin" ~/.zshrc; then
    echo "export PATH=\"$INSTALL_DIR/jdk-22.0.1.jdk/Contents/Home/bin:\$PATH\"" >> ~/.zshrc
fi

if ! grep -q "apache-maven-3.9.6/bin" ~/.zshrc; then
    echo "export PATH=\"$INSTALL_DIR/apache-maven-3.9.6/bin:\$PATH\"" >> ~/.zshrc
fi

if [ -z "$JAVA_HOME" ] || [[ "$JAVA_HOME" != *"/jdk-22.0.1.jdk"* ]]; then
    echo "export JAVA_HOME=\"$INSTALL_DIR/jdk-22.0.1.jdk\"" >> ~/.zshrc
fi

source ~/.zshrc
