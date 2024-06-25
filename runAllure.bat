set ProjectPath=%~dp0
cd %ProjectPath%
echo %ProjectPath% 
set p=%PATH%
java -javaagent:"%ProjectPath%\libAllure\aspectjweaver-1.9.20.jar"
 -classpath %ProjectPath%libAllureReport\*;
 %ProjectPath%libLog4Jver2\*;
 %ProjectPath%libExtent5\*;
 %ProjectPath%libSelenium\*;" org.testng.TestNG "%ProjectPath%resources\RunTestWithAllure.xml"
allure serve .\allure-json\
pause