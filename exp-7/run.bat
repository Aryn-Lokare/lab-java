@echo off
setlocal
javac "exp-7.java"
if errorlevel 1 goto end
java exp7
:end
endlocal
