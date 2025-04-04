/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Detail type.
 */
public class Detail {
    private String errorcode;

    /**
     * Default constructor.
     */
    public Detail() {
    }

    /**
     * Initialization constructor.
     * @param  errorcode  String value for errorcode.
     */
    public Detail(
            String errorcode) {
        this.errorcode = errorcode;
    }

    /**
     * Getter for Errorcode.
     * The error code.
     * @return Returns the String
     */
    @JsonGetter("errorcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Setter for Errorcode.
     * The error code.
     * @param errorcode Value for String
     */
    @JsonSetter("errorcode")
    public void setErrorcode(String errorcode) {
        this.errorcode = errorcode;
    }

    /**
     * Converts this Detail into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Detail [" + "errorcode=" + errorcode + "]";
    }

    /**
     * Builds a new {@link Detail.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Detail.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .errorcode(getErrorcode());
        return builder;
    }

    /**
     * Class to build instances of {@link Detail}.
     */
    public static class Builder {
        private String errorcode;



        /**
         * Setter for errorcode.
         * @param  errorcode  String value for errorcode.
         * @return Builder
         */
        public Builder errorcode(String errorcode) {
            this.errorcode = errorcode;
            return this;
        }

        /**
         * Builds a new {@link Detail} object using the set fields.
         * @return {@link Detail}
         */
        public Detail build() {
            return new Detail(errorcode);
        }
    }
}
