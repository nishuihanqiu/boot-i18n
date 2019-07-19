package com.lls.i18n.util;

import com.lls.i18n.config.Nullable;
import com.lls.i18n.exception.NotFoundException;

/************************************
 * ExceptionUtils
 * @author liliangshan
 * @date 2019-07-19
 ************************************/
public class ExceptionUtils {

    public static void checkNull(@Nullable Object object, String message) throws NotFoundException {
        if (object != null) {
            return;
        }
        throw new NotFoundException(message);
    }

    public static void checkArgumentNull(@Nullable Object object, String message) throws IllegalArgumentException {
        if (object != null) {
            return;
        }
        throw new IllegalArgumentException(message);
    }

}
