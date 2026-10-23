@echo off
setlocal
javac "exp-11.java"
if errorlevel 1 goto end
java exp11
:end
endlocal
