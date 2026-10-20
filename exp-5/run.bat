@echo off
setlocal
javac "exp-5.java"
if errorlevel 1 goto end
java exp5
:end
endlocal
