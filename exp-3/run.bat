@echo off
setlocal
javac "exp-3.java"
if errorlevel 1 goto end
java exp3
:end
endlocal
