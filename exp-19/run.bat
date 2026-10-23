@echo off
setlocal
javac "exp-19.java"
if errorlevel 1 goto end
java exp19
:end
endlocal
