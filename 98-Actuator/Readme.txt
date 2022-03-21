Actuator
 -It helps you to monitor and manage
 -Spring boot Actuator gives you number of built in end point and let you add your own end points
 -Optionally you can enable or disable each individual end point

Steps to use Actuator
	1. Add the dependency in pom.xml
	2. Optionally add properties in application.property file
 http://localhost:8083/actuator
This is the default end point given by actuator
This end point tells you all the end points given by actuator 
General Syntax of end point is as follows
	-/actuator/id
	>id is a built in end point given by actuator
		eg., /actuator/health (This end point gives us the health information about the application ->Up or Down)

Enabling the actuator end points
>management.endpoint.id.enabled=true(id is actual end point to enable)
>/actuator/beans ->This end point display complete list of beans in configured in application 
 
