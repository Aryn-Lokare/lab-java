@echo off
setlocal
javac "exp-14.java"
if errorlevel 1 goto end
java exp14
:end
endlocal
