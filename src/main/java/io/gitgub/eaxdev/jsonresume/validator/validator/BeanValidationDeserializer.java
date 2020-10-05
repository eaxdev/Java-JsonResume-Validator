package io.gitgub.eaxdev.jsonresume.validator.validator;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;

import javax.validation.*;
import java.io.IOException;
import java.util.Set;
import java.util.stream.Collectors;


public class BeanValidationDeserializer extends BeanDeserializer {

    private static final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    private final Validator validator = factory.getValidator();

    public BeanValidationDeserializer(BeanDeserializerBase src) {
        super(src);
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctx) throws IOException {
        Object instance = super.deserialize(p, ctx);
        validate(instance);
        return instance;
    }

    private void validate(final Object instance) {
        final Set<ConstraintViolation<Object>> violations = validator.validate(instance);
        if (!violations.isEmpty()) {
            final String message = "JSON is not valid. Reasons (" + violations.size() + "): ";
            final String errorMessages = violations.stream()
                    .map(v -> "Value `" + v.getInvalidValue() + "` is not correct. " + v.getMessage())
                    .collect(Collectors.joining(System.lineSeparator()));
            throw new ConstraintViolationException(message + errorMessages, violations);
        }
    }

}
