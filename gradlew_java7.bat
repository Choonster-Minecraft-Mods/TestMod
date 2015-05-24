@echo OFF

rem Sets JAVA_HOME to JDK 7 before launching Gradle because ForgeGradle 1.0 is incompatible with JDK 8

setlocal
set "JAVA_HOME=C:\Program Files\Java\jdk1.7.0_79"

./gradlew.bat %*

endlocal