@echo off
setlocal
javac "exp-18.java"
if errorlevel 1 goto end
java exp18
:end
endlocal
