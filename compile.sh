#!/bin/sh
rm -Rf bin
find -name *.java > sources.txt
javac -sourcepath src/Main.java @sources.txt -d bin