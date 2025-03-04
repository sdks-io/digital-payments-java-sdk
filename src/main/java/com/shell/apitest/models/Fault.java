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
 * This is a model class for Fault type.
 */
public class Fault {
    private String faultstring;
    private Detail detail;

    /**
     * Default constructor.
     */
    public Fault() {
    }

    /**
     * Initialization constructor.
     * @param  faultstring  String value for faultstring.
     * @param  detail  Detail value for detail.
     */
    public Fault(
            String faultstring,
            Detail detail) {
        this.faultstring = faultstring;
        this.detail = detail;
    }

    /**
     * Getter for Faultstring.
     * The description of the error.
     * @return Returns the String
     */
    @JsonGetter("faultstring")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Setter for Faultstring.
     * The description of the error.
     * @param faultstring Value for String
     */
    @JsonSetter("faultstring")
    public void setFaultstring(String faultstring) {
        this.faultstring = faultstring;
    }

    /**
     * Getter for Detail.
     * @return Returns the Detail
     */
    @JsonGetter("detail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Detail getDetail() {
        return detail;
    }

    /**
     * Setter for Detail.
     * @param detail Value for Detail
     */
    @JsonSetter("detail")
    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    /**
     * Converts this Fault into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Fault [" + "faultstring=" + faultstring + ", detail=" + detail + "]";
    }

    /**
     * Builds a new {@link Fault.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Fault.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .faultstring(getFaultstring())
                .detail(getDetail());
        return builder;
    }

    /**
     * Class to build instances of {@link Fault}.
     */
    public static class Builder {
        private String faultstring;
        private Detail detail;



        /**
         * Setter for faultstring.
         * @param  faultstring  String value for faultstring.
         * @return Builder
         */
        public Builder faultstring(String faultstring) {
            this.faultstring = faultstring;
            return this;
        }

        /**
         * Setter for detail.
         * @param  detail  Detail value for detail.
         * @return Builder
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * Builds a new {@link Fault} object using the set fields.
         * @return {@link Fault}
         */
        public Fault build() {
            return new Fault(faultstring, detail);
        }
    }
}
