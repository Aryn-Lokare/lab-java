@echo off
setlocal
javac "exp-25.java"
if errorlevel 1 goto end
java exp25
:end
endlocal
