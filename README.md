# Spring CXF JAXWS example

### Prerequisites

* JDK 1.6+
* Maven 3.0+
* Tomcat 7.0+ 
* SOAPUI

### How to Run
Open a command prompt, cd to the same directory as the top level pom and run:

mvn clean package

Then copy the war file in the target folder to the Tomcat webapps directory

### Call Webservice

In SOAPUI create a SOAP project from http://localhost:8080/subtraction-service/SubtractionService?wsdl.  Add numbers into the two elements subtractionParamOne and subtractionParamOne.  When you call the webservice you will get the subtraction value in the response


