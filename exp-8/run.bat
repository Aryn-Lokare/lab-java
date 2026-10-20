@echo off
setlocal
javac "exp-8.java"
if errorlevel 1 goto end
java exp8
:end
endlocal
