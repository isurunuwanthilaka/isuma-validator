package com.isumalab.isumavalidator.nic;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NICValidator implements ConstraintValidator<NIC, String> {

    @Override
    public void initialize(NIC nic) {
    }

    @Override
    public boolean isValid(String nicField, ConstraintValidatorContext cxt) {
        return nicField != null && nicField.matches("[0-9]+")
                && (nicField.length() > 8) && (nicField.length() < 14);
    }
}
