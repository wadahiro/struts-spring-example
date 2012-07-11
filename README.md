struts-spring-example
=====================

This sample application is based on Mkyoun.com example.
See http://www.mkyong.com/struts/struts-spring-integration-example/

Change Log
---------------------
2012-07-07 : Hiroyuki Wada

	* Convert to gradle project from maven.
	* Change dao implements from Hibernate to Spring JDBC Template.
	* Add SetCharacterEncodingFilter class for Multibyte environment.
	* Change spring configuration designed to load files from classpath.
	* Change database from mysql to h2database.


How to use
---------------------
1. Run 'gradlew eclipse' and import to Eclipse.
2. You can execute this application by run 'gradlew jettyRun'.