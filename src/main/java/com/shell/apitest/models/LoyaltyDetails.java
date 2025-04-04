/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for LoyaltyDetails type.
 */
public class LoyaltyDetails {
    private String loyaltyId;
    private String loyaltyType;

    /**
     * Default constructor.
     */
    public LoyaltyDetails() {
    }

    /**
     * Initialization constructor.
     * @param  loyaltyId  String value for loyaltyId.
     * @param  loyaltyType  String value for loyaltyType.
     */
    public LoyaltyDetails(
            String loyaltyId,
            String loyaltyType) {
        this.loyaltyId = loyaltyId;
        this.loyaltyType = loyaltyType;
    }

    /**
     * Getter for LoyaltyId.
     * The user’s Loyalty card number. Although this is optional the expectation is that if this is
     * specified then loyaltyType must also be specified
     * @return Returns the String
     */
    @JsonGetter("loyaltyId")
    public String getLoyaltyId() {
        return loyaltyId;
    }

    /**
     * Setter for LoyaltyId.
     * The user’s Loyalty card number. Although this is optional the expectation is that if this is
     * specified then loyaltyType must also be specified
     * @param loyaltyId Value for String
     */
    @JsonSetter("loyaltyId")
    public void setLoyaltyId(String loyaltyId) {
        this.loyaltyId = loyaltyId;
    }

    /**
     * Getter for LoyaltyType.
     * Loyalty type being used, associated to the loyalty ID being passed. Possible values are
     * 'Shell'
     * @return Returns the String
     */
    @JsonGetter("loyaltyType")
    public String getLoyaltyType() {
        return loyaltyType;
    }

    /**
     * Setter for LoyaltyType.
     * Loyalty type being used, associated to the loyalty ID being passed. Possible values are
     * 'Shell'
     * @param loyaltyType Value for String
     */
    @JsonSetter("loyaltyType")
    public void setLoyaltyType(String loyaltyType) {
        this.loyaltyType = loyaltyType;
    }

    /**
     * Converts this LoyaltyDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LoyaltyDetails [" + "loyaltyId=" + loyaltyId + ", loyaltyType=" + loyaltyType + "]";
    }

    /**
     * Builds a new {@link LoyaltyDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LoyaltyDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(loyaltyId, loyaltyType);
        return builder;
    }

    /**
     * Class to build instances of {@link LoyaltyDetails}.
     */
    public static class Builder {
        private String loyaltyId;
        private String loyaltyType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  loyaltyId  String value for loyaltyId.
         * @param  loyaltyType  String value for loyaltyType.
         */
        public Builder(String loyaltyId, String loyaltyType) {
            this.loyaltyId = loyaltyId;
            this.loyaltyType = loyaltyType;
        }

        /**
         * Setter for loyaltyId.
         * @param  loyaltyId  String value for loyaltyId.
         * @return Builder
         */
        public Builder loyaltyId(String loyaltyId) {
            this.loyaltyId = loyaltyId;
            return this;
        }

        /**
         * Setter for loyaltyType.
         * @param  loyaltyType  String value for loyaltyType.
         * @return Builder
         */
        public Builder loyaltyType(String loyaltyType) {
            this.loyaltyType = loyaltyType;
            return this;
        }

        /**
         * Builds a new {@link LoyaltyDetails} object using the set fields.
         * @return {@link LoyaltyDetails}
         */
        public LoyaltyDetails build() {
            return new LoyaltyDetails(loyaltyId, loyaltyType);
        }
    }
}
