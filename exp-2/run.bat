@echo off
setlocal
javac "exp-2.java"
if errorlevel 1 goto end
java exp2
:end
endlocal
