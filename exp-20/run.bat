@echo off
setlocal
javac "exp-20.java"
if errorlevel 1 goto end
java exp20
:end
endlocal
