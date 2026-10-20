@echo off
setlocal
javac "exp-9.java"
if errorlevel 1 goto end
java exp9
:end
endlocal
