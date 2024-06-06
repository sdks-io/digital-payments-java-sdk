/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CollectingCompany type.
 */
public class CollectingCompany {
    private String colCoId;

    /**
     * Default constructor.
     */
    public CollectingCompany() {
    }

    /**
     * Initialization constructor.
     * @param  colCoId  String value for colCoId.
     */
    public CollectingCompany(
            String colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Getter for ColCoId.
     * The ID of the Collecting Company (in GFN), also known as Shell Code of the selected payer.
     * This property is mandatory if the ColCoCode code is not passed
     * @return Returns the String
     */
    @JsonGetter("ColCoId")
    public String getColCoId() {
        return colCoId;
    }

    /**
     * Setter for ColCoId.
     * The ID of the Collecting Company (in GFN), also known as Shell Code of the selected payer.
     * This property is mandatory if the ColCoCode code is not passed
     * @param colCoId Value for String
     */
    @JsonSetter("ColCoId")
    public void setColCoId(String colCoId) {
        this.colCoId = colCoId;
    }

    /**
     * Converts this CollectingCompany into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CollectingCompany [" + "colCoId=" + colCoId + "]";
    }

    /**
     * Builds a new {@link CollectingCompany.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CollectingCompany.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(colCoId);
        return builder;
    }

    /**
     * Class to build instances of {@link CollectingCompany}.
     */
    public static class Builder {
        private String colCoId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  colCoId  String value for colCoId.
         */
        public Builder(String colCoId) {
            this.colCoId = colCoId;
        }

        /**
         * Setter for colCoId.
         * @param  colCoId  String value for colCoId.
         * @return Builder
         */
        public Builder colCoId(String colCoId) {
            this.colCoId = colCoId;
            return this;
        }

        /**
         * Builds a new {@link CollectingCompany} object using the set fields.
         * @return {@link CollectingCompany}
         */
        public CollectingCompany build() {
            return new CollectingCompany(colCoId);
        }
    }
}
