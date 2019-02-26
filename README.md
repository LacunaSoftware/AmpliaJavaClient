# Amplia client lib for Java

This library contains classes that encapsulate the call to the Amplia service (X.509 certificate
issuing solution) for Java applications.

The recommended way to install it is with Gradle:

    repositories {
        mavenCentral()
        maven {
            url  "http://dl.bintray.com/lacunasoftware/maven"
        }
    }
 
    dependencies {
        compile("com.lacunasoftware.amplia:amplia-client:1.0.0")
        ...
    }

Or with Maven:

    <dependency>
      <groupId>com.lacunasoftware.amplia</groupId>
      <artifactId>amplia-client</artifactId>
      <version>1.0.0/version>
      <type>pom</type>
    </dependency>


For more information, see https://www.lacunasoftware.com
