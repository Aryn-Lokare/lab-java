@echo off
setlocal
javac "exp-15.java"
if errorlevel 1 goto end
java exp15
:end
endlocal
