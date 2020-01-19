package io.gitgub.eaxdev.jsonresume.validator.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {CountryCodeValidator.class})
public @interface CountryCode {

    String message() default "Country code must be correct of ISO 3166-1 standard";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
