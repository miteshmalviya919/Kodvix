package Banking_App.Util;

import Banking_App.exception.ValidationException;

@FunctionalInterface
public interface Validation<T> {

    void validate(T values) throws ValidationException;


}
