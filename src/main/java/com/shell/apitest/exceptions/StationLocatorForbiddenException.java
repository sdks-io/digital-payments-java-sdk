/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for StationLocatorForbiddenException type.
 */
public class StationLocatorForbiddenException extends ApiException {
    private static final long serialVersionUID = -3859937984456938560L;
    private String errorCode;
    private String errorDescription;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public StationLocatorForbiddenException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ErrorCode.
     * @return Returns the String
     */
    @JsonGetter("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for ErrorCode.
     * @param errorCode Value for String
     */
    @JsonSetter("errorCode")
    private void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorDescription.
     * @return Returns the String
     */
    @JsonGetter("errorDescription")
    public String getErrorDescription() {
        return this.errorDescription;
    }

    /**
     * Setter for ErrorDescription.
     * @param errorDescription Value for String
     */
    @JsonSetter("errorDescription")
    private void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * Converts this StationLocatorForbiddenException into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "StationLocatorForbiddenException [" + "statusCode=" + getResponseCode()
                + ", message=" + getMessage() + ", errorCode=" + errorCode + ", errorDescription="
                + errorDescription + "]";
    }
}
