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
 * This is a model class for Loc type.
 */
public class Loc {
    private String street;
    private String pc;
    private String city;
    private String region;
    private String country;
    private String ccode;

    /**
     * Default constructor.
     */
    public Loc() {
    }

    /**
     * Initialization constructor.
     * @param  country  String value for country.
     * @param  ccode  String value for ccode.
     * @param  street  String value for street.
     * @param  pc  String value for pc.
     * @param  city  String value for city.
     * @param  region  String value for region.
     */
    public Loc(
            String country,
            String ccode,
            String street,
            String pc,
            String city,
            String region) {
        this.street = street;
        this.pc = pc;
        this.city = city;
        this.region = region;
        this.country = country;
        this.ccode = ccode;
    }

    /**
     * Getter for Street.
     * The station’s full street address, including building number
     * @return Returns the String
     */
    @JsonGetter("street")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStreet() {
        return street;
    }

    /**
     * Setter for Street.
     * The station’s full street address, including building number
     * @param street Value for String
     */
    @JsonSetter("street")
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter for Pc.
     * The station’s postcode
     * @return Returns the String
     */
    @JsonGetter("pc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPc() {
        return pc;
    }

    /**
     * Setter for Pc.
     * The station’s postcode
     * @param pc Value for String
     */
    @JsonSetter("pc")
    public void setPc(String pc) {
        this.pc = pc;
    }

    /**
     * Getter for City.
     * The city the station is located within
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * The city the station is located within
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Region.
     * The region the station is located within
     * @return Returns the String
     */
    @JsonGetter("region")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRegion() {
        return region;
    }

    /**
     * Setter for Region.
     * The region the station is located within
     * @param region Value for String
     */
    @JsonSetter("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Getter for Country.
     * The name of the country (in English) the station is located within
     * @return Returns the String
     */
    @JsonGetter("country")
    public String getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * The name of the country (in English) the station is located within
     * @param country Value for String
     */
    @JsonSetter("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Getter for Ccode.
     * The two-letter ISO 3166 country code of the country the station is located within
     * @return Returns the String
     */
    @JsonGetter("ccode")
    public String getCcode() {
        return ccode;
    }

    /**
     * Setter for Ccode.
     * The two-letter ISO 3166 country code of the country the station is located within
     * @param ccode Value for String
     */
    @JsonSetter("ccode")
    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    /**
     * Converts this Loc into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Loc [" + "country=" + country + ", ccode=" + ccode + ", street=" + street + ", pc="
                + pc + ", city=" + city + ", region=" + region + "]";
    }

    /**
     * Builds a new {@link Loc.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Loc.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(country, ccode)
                .street(getStreet())
                .pc(getPc())
                .city(getCity())
                .region(getRegion());
        return builder;
    }

    /**
     * Class to build instances of {@link Loc}.
     */
    public static class Builder {
        private String country;
        private String ccode;
        private String street;
        private String pc;
        private String city;
        private String region;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  country  String value for country.
         * @param  ccode  String value for ccode.
         */
        public Builder(String country, String ccode) {
            this.country = country;
            this.ccode = ccode;
        }

        /**
         * Setter for country.
         * @param  country  String value for country.
         * @return Builder
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for ccode.
         * @param  ccode  String value for ccode.
         * @return Builder
         */
        public Builder ccode(String ccode) {
            this.ccode = ccode;
            return this;
        }

        /**
         * Setter for street.
         * @param  street  String value for street.
         * @return Builder
         */
        public Builder street(String street) {
            this.street = street;
            return this;
        }

        /**
         * Setter for pc.
         * @param  pc  String value for pc.
         * @return Builder
         */
        public Builder pc(String pc) {
            this.pc = pc;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for region.
         * @param  region  String value for region.
         * @return Builder
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * Builds a new {@link Loc} object using the set fields.
         * @return {@link Loc}
         */
        public Loc build() {
            return new Loc(country, ccode, street, pc, city, region);
        }
    }
}
