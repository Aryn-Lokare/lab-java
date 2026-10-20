@echo off
setlocal
javac "exp-1.java"
if errorlevel 1 goto end
java exp1
:end
endlocal
