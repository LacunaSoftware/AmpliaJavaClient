# Amplia client lib for Java

This library contains classes that encapsulate the call to the Amplia service (X.509 certificate
issuing solution) for Java applications.

The recommended way to install it is with Gradle:

    repositories {
        mavenCentral()
    }
 
    dependencies {
        compile("com.lacunasoftware.amplia:amplia-client:1.1.2")
        ...
    }

Or with Maven:

    <dependency>
      <groupId>com.lacunasoftware.amplia</groupId>
      <artifactId>amplia-client</artifactId>
      <version>1.1.2/version>
      <type>pom</type>
    </dependency>


For more information, see https://www.lacunasoftware.com
