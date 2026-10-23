@echo off
setlocal
javac "exp-16.java"
if errorlevel 1 goto end
java exp16
:end
endlocal
