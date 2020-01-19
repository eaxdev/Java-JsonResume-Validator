# Java JsonResume Validator
[![Build Status](https://github.com/eaxdev/Java-JsonResume-Validator/workflows/build/badge.svg)](https://github.com/eaxdev/Java-JsonResume-Validator/actions)
[![GitHub license](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/eaxdev/Java-JsonResume-Validator/master/LICENSE)

Java library to validate JSON resumes to ensure that they are according to the [defined schema](https://jsonresume.org/schema/)

> For more information on JSON resumes, please see the [official JSON Resume initiative](https://jsonresume.org)

## Usage
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
