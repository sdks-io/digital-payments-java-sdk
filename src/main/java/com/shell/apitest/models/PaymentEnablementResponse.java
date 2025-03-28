/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentEnablementResponse type.
 */
public class PaymentEnablementResponse {
    private String dpanLast4;

    /**
     * Default constructor.
     */
    public PaymentEnablementResponse() {
    }

    /**
     * Initialization constructor.
     * @param  dpanLast4  String value for dpanLast4.
     */
    public PaymentEnablementResponse(
            String dpanLast4) {
        this.dpanLast4 = dpanLast4;
    }

    /**
     * Getter for DpanLast4.
     * DPan Last number
     * @return Returns the String
     */
    @JsonGetter("dpanLast4")
    public String getDpanLast4() {
        return dpanLast4;
    }

    /**
     * Setter for DpanLast4.
     * DPan Last number
     * @param dpanLast4 Value for String
     */
    @JsonSetter("dpanLast4")
    public void setDpanLast4(String dpanLast4) {
        this.dpanLast4 = dpanLast4;
    }

    /**
     * Converts this PaymentEnablementResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentEnablementResponse [" + "dpanLast4=" + dpanLast4 + "]";
    }

    /**
     * Builds a new {@link PaymentEnablementResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentEnablementResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dpanLast4);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentEnablementResponse}.
     */
    public static class Builder {
        private String dpanLast4;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dpanLast4  String value for dpanLast4.
         */
        public Builder(String dpanLast4) {
            this.dpanLast4 = dpanLast4;
        }

        /**
         * Setter for dpanLast4.
         * @param  dpanLast4  String value for dpanLast4.
         * @return Builder
         */
        public Builder dpanLast4(String dpanLast4) {
            this.dpanLast4 = dpanLast4;
            return this;
        }

        /**
         * Builds a new {@link PaymentEnablementResponse} object using the set fields.
         * @return {@link PaymentEnablementResponse}
         */
        public PaymentEnablementResponse build() {
            return new PaymentEnablementResponse(dpanLast4);
        }
    }
}
