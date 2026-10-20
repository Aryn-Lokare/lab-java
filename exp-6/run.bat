@echo off
setlocal
javac "exp-6.java"
if errorlevel 1 goto end
java exp6
:end
endlocal
