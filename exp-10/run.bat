@echo off
setlocal
javac "exp-10.java"
if errorlevel 1 goto end
java exp10
:end
endlocal
