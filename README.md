# Java JsonResume Validator
[![Build Status](https://github.com/eaxdev/Java-JsonResume-Validator/workflows/build/badge.svg)](https://github.com/eaxdev/Java-JsonResume-Validator/actions)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/eaxdev/Java-JsonResume-Validator/master/LICENSE)
![Maven Central](https://img.shields.io/maven-central/v/io.github.eaxdev/jsonresume-validator)

Java library to validate JSON resumes to ensure that they are according to the [defined schema](https://jsonresume.org/schema/)

> For more information on JSON resumes, please see the [official JSON Resume initiative](https://jsonresume.org)

## Using
For Maven-based projects, add the following to your POM file (the dependency are available at Maven Central):
```xml
<dependency>
    <groupId>io.github.eaxdev</groupId>
    <artifactId>jsonresume-validator</artifactId>
    <version>0.0.1</version>
</dependency>
```
If you using Gradle, add this in your `build.gradle`:
```
compile group: 'io.github.eaxdev', name: 'jsonresume-validator', version: '0.0.1'
```

And then use it in your code:

```java
public class JsonResumeValidatorExample {
    public static void main(String[] args) throws JsonResumeParseException {
      //Create JsonResume object and initialize it with JSON string
      final String json = "{}";
      final JsonResume jsonResume = new JsonResume(json);
      //validate it
      final boolean isValid = jsonResume.isValid();
      // if you want to get deserialized object, you can just call
      final Resume deserializedResume = jsonResume.deserialize();
    }
}
```
