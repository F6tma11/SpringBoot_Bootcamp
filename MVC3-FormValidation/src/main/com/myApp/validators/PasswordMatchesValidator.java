package main.com.myApp.validators;

import main.com.myApp.annotations.PasswordMatches;
import main.com.myApp.model.UserData;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, UserData> {
    @Override
    public boolean isValid(UserData userData, ConstraintValidatorContext constraintValidatorContext) {
        if (userData == null) {
            return true;
        }

        if (userData.getPassword() == null ||
                userData.getConfirmPassword() == null) {
            return true;
        }

        if (!userData.getPassword().equals(userData.getConfirmPassword())) {

            constraintValidatorContext.disableDefaultConstraintViolation();

            constraintValidatorContext.buildConstraintViolationWithTemplate(
                            constraintValidatorContext.getDefaultConstraintMessageTemplate()
                    )
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation();

            return false;
        }

        return true;
    }
}
