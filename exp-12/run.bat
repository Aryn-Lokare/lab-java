@echo off
setlocal
javac "exp-12.java"
if errorlevel 1 goto end
java exp12
:end
endlocal
