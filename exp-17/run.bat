@echo off
setlocal
javac "exp-17.java"
if errorlevel 1 goto end
java exp17
:end
endlocal
