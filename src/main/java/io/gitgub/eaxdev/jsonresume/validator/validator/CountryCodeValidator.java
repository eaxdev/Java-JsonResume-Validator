package io.gitgub.eaxdev.jsonresume.validator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.*;

public class CountryCodeValidator implements ConstraintValidator<CountryCode, String> {

    private static final List<String> ISO_COUNTRIES = Arrays.asList(Locale.getISOCountries());

    @Override
    public void initialize(CountryCode constraintAnnotation) {
        // noop
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (Objects.nonNull(value)) {
            Optional<String> countryCode = ISO_COUNTRIES.stream()
                    .filter(code -> code.equals(value))
                    .findAny();
            return countryCode.isPresent();
        }
        return true;
    }

}
