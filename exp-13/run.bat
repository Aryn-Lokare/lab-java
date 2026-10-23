@echo off
setlocal
javac "exp-13.java"
if errorlevel 1 goto end
java exp13
:end
endlocal
