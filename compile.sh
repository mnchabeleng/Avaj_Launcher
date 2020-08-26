#!/bin/sh
find -name *.java > sources.txt
javac -sourcepath src/Main.java @sources.txt -d bin