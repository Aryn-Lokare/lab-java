@echo off
setlocal
javac "exp-4.java"
if errorlevel 1 goto end
java exp4
:end
endlocal
