/*
 * ShellEVLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AroundLocationArrayDataItemsOpeningHoursItems type.
 */
public class AroundLocationArrayDataItemsOpeningHoursItems {
    private String closingFromHours;
    private String closingFromMinutes;
    private String closingToHours;
    private String closingToMinutes;
    private String fromDay;
    private String openingFromHours;
    private String openingFromMinutes;
    private String openingToHours;
    private String openingToMinutes;
    private String toDay;

    /**
     * Default constructor.
     */
    public AroundLocationArrayDataItemsOpeningHoursItems() {
    }

    /**
     * Initialization constructor.
     * @param  closingFromHours  String value for closingFromHours.
     * @param  closingFromMinutes  String value for closingFromMinutes.
     * @param  closingToHours  String value for closingToHours.
     * @param  closingToMinutes  String value for closingToMinutes.
     * @param  fromDay  String value for fromDay.
     * @param  openingFromHours  String value for openingFromHours.
     * @param  openingFromMinutes  String value for openingFromMinutes.
     * @param  openingToHours  String value for openingToHours.
     * @param  openingToMinutes  String value for openingToMinutes.
     * @param  toDay  String value for toDay.
     */
    public AroundLocationArrayDataItemsOpeningHoursItems(
            String closingFromHours,
            String closingFromMinutes,
            String closingToHours,
            String closingToMinutes,
            String fromDay,
            String openingFromHours,
            String openingFromMinutes,
            String openingToHours,
            String openingToMinutes,
            String toDay) {
        this.closingFromHours = closingFromHours;
        this.closingFromMinutes = closingFromMinutes;
        this.closingToHours = closingToHours;
        this.closingToMinutes = closingToMinutes;
        this.fromDay = fromDay;
        this.openingFromHours = openingFromHours;
        this.openingFromMinutes = openingFromMinutes;
        this.openingToHours = openingToHours;
        this.openingToMinutes = openingToMinutes;
        this.toDay = toDay;
    }

    /**
     * Getter for ClosingFromHours.
     * @return Returns the String
     */
    @JsonGetter("Closing_From_Hours")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClosingFromHours() {
        return closingFromHours;
    }

    /**
     * Setter for ClosingFromHours.
     * @param closingFromHours Value for String
     */
    @JsonSetter("Closing_From_Hours")
    public void setClosingFromHours(String closingFromHours) {
        this.closingFromHours = closingFromHours;
    }

    /**
     * Getter for ClosingFromMinutes.
     * @return Returns the String
     */
    @JsonGetter("Closing_From_Minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClosingFromMinutes() {
        return closingFromMinutes;
    }

    /**
     * Setter for ClosingFromMinutes.
     * @param closingFromMinutes Value for String
     */
    @JsonSetter("Closing_From_Minutes")
    public void setClosingFromMinutes(String closingFromMinutes) {
        this.closingFromMinutes = closingFromMinutes;
    }

    /**
     * Getter for ClosingToHours.
     * @return Returns the String
     */
    @JsonGetter("Closing_To_Hours")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClosingToHours() {
        return closingToHours;
    }

    /**
     * Setter for ClosingToHours.
     * @param closingToHours Value for String
     */
    @JsonSetter("Closing_To_Hours")
    public void setClosingToHours(String closingToHours) {
        this.closingToHours = closingToHours;
    }

    /**
     * Getter for ClosingToMinutes.
     * @return Returns the String
     */
    @JsonGetter("Closing_To_Minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClosingToMinutes() {
        return closingToMinutes;
    }

    /**
     * Setter for ClosingToMinutes.
     * @param closingToMinutes Value for String
     */
    @JsonSetter("Closing_To_Minutes")
    public void setClosingToMinutes(String closingToMinutes) {
        this.closingToMinutes = closingToMinutes;
    }

    /**
     * Getter for FromDay.
     * @return Returns the String
     */
    @JsonGetter("From_Day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFromDay() {
        return fromDay;
    }

    /**
     * Setter for FromDay.
     * @param fromDay Value for String
     */
    @JsonSetter("From_Day")
    public void setFromDay(String fromDay) {
        this.fromDay = fromDay;
    }

    /**
     * Getter for OpeningFromHours.
     * @return Returns the String
     */
    @JsonGetter("Opening_From_Hours")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOpeningFromHours() {
        return openingFromHours;
    }

    /**
     * Setter for OpeningFromHours.
     * @param openingFromHours Value for String
     */
    @JsonSetter("Opening_From_Hours")
    public void setOpeningFromHours(String openingFromHours) {
        this.openingFromHours = openingFromHours;
    }

    /**
     * Getter for OpeningFromMinutes.
     * @return Returns the String
     */
    @JsonGetter("Opening_From_Minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOpeningFromMinutes() {
        return openingFromMinutes;
    }

    /**
     * Setter for OpeningFromMinutes.
     * @param openingFromMinutes Value for String
     */
    @JsonSetter("Opening_From_Minutes")
    public void setOpeningFromMinutes(String openingFromMinutes) {
        this.openingFromMinutes = openingFromMinutes;
    }

    /**
     * Getter for OpeningToHours.
     * @return Returns the String
     */
    @JsonGetter("Opening_To_Hours")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOpeningToHours() {
        return openingToHours;
    }

    /**
     * Setter for OpeningToHours.
     * @param openingToHours Value for String
     */
    @JsonSetter("Opening_To_Hours")
    public void setOpeningToHours(String openingToHours) {
        this.openingToHours = openingToHours;
    }

    /**
     * Getter for OpeningToMinutes.
     * @return Returns the String
     */
    @JsonGetter("Opening_To_Minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOpeningToMinutes() {
        return openingToMinutes;
    }

    /**
     * Setter for OpeningToMinutes.
     * @param openingToMinutes Value for String
     */
    @JsonSetter("Opening_To_Minutes")
    public void setOpeningToMinutes(String openingToMinutes) {
        this.openingToMinutes = openingToMinutes;
    }

    /**
     * Getter for ToDay.
     * @return Returns the String
     */
    @JsonGetter("To_Day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToDay() {
        return toDay;
    }

    /**
     * Setter for ToDay.
     * @param toDay Value for String
     */
    @JsonSetter("To_Day")
    public void setToDay(String toDay) {
        this.toDay = toDay;
    }

    /**
     * Converts this AroundLocationArrayDataItemsOpeningHoursItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AroundLocationArrayDataItemsOpeningHoursItems [" + "closingFromHours="
                + closingFromHours + ", closingFromMinutes=" + closingFromMinutes
                + ", closingToHours=" + closingToHours + ", closingToMinutes=" + closingToMinutes
                + ", fromDay=" + fromDay + ", openingFromHours=" + openingFromHours
                + ", openingFromMinutes=" + openingFromMinutes + ", openingToHours="
                + openingToHours + ", openingToMinutes=" + openingToMinutes + ", toDay=" + toDay
                + "]";
    }

    /**
     * Builds a new {@link AroundLocationArrayDataItemsOpeningHoursItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AroundLocationArrayDataItemsOpeningHoursItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .closingFromHours(getClosingFromHours())
                .closingFromMinutes(getClosingFromMinutes())
                .closingToHours(getClosingToHours())
                .closingToMinutes(getClosingToMinutes())
                .fromDay(getFromDay())
                .openingFromHours(getOpeningFromHours())
                .openingFromMinutes(getOpeningFromMinutes())
                .openingToHours(getOpeningToHours())
                .openingToMinutes(getOpeningToMinutes())
                .toDay(getToDay());
        return builder;
    }

    /**
     * Class to build instances of {@link AroundLocationArrayDataItemsOpeningHoursItems}.
     */
    public static class Builder {
        private String closingFromHours;
        private String closingFromMinutes;
        private String closingToHours;
        private String closingToMinutes;
        private String fromDay;
        private String openingFromHours;
        private String openingFromMinutes;
        private String openingToHours;
        private String openingToMinutes;
        private String toDay;



        /**
         * Setter for closingFromHours.
         * @param  closingFromHours  String value for closingFromHours.
         * @return Builder
         */
        public Builder closingFromHours(String closingFromHours) {
            this.closingFromHours = closingFromHours;
            return this;
        }

        /**
         * Setter for closingFromMinutes.
         * @param  closingFromMinutes  String value for closingFromMinutes.
         * @return Builder
         */
        public Builder closingFromMinutes(String closingFromMinutes) {
            this.closingFromMinutes = closingFromMinutes;
            return this;
        }

        /**
         * Setter for closingToHours.
         * @param  closingToHours  String value for closingToHours.
         * @return Builder
         */
        public Builder closingToHours(String closingToHours) {
            this.closingToHours = closingToHours;
            return this;
        }

        /**
         * Setter for closingToMinutes.
         * @param  closingToMinutes  String value for closingToMinutes.
         * @return Builder
         */
        public Builder closingToMinutes(String closingToMinutes) {
            this.closingToMinutes = closingToMinutes;
            return this;
        }

        /**
         * Setter for fromDay.
         * @param  fromDay  String value for fromDay.
         * @return Builder
         */
        public Builder fromDay(String fromDay) {
            this.fromDay = fromDay;
            return this;
        }

        /**
         * Setter for openingFromHours.
         * @param  openingFromHours  String value for openingFromHours.
         * @return Builder
         */
        public Builder openingFromHours(String openingFromHours) {
            this.openingFromHours = openingFromHours;
            return this;
        }

        /**
         * Setter for openingFromMinutes.
         * @param  openingFromMinutes  String value for openingFromMinutes.
         * @return Builder
         */
        public Builder openingFromMinutes(String openingFromMinutes) {
            this.openingFromMinutes = openingFromMinutes;
            return this;
        }

        /**
         * Setter for openingToHours.
         * @param  openingToHours  String value for openingToHours.
         * @return Builder
         */
        public Builder openingToHours(String openingToHours) {
            this.openingToHours = openingToHours;
            return this;
        }

        /**
         * Setter for openingToMinutes.
         * @param  openingToMinutes  String value for openingToMinutes.
         * @return Builder
         */
        public Builder openingToMinutes(String openingToMinutes) {
            this.openingToMinutes = openingToMinutes;
            return this;
        }

        /**
         * Setter for toDay.
         * @param  toDay  String value for toDay.
         * @return Builder
         */
        public Builder toDay(String toDay) {
            this.toDay = toDay;
            return this;
        }

        /**
         * Builds a new {@link AroundLocationArrayDataItemsOpeningHoursItems} object using the set
         * fields.
         * @return {@link AroundLocationArrayDataItemsOpeningHoursItems}
         */
        public AroundLocationArrayDataItemsOpeningHoursItems build() {
            return new AroundLocationArrayDataItemsOpeningHoursItems(closingFromHours,
                    closingFromMinutes, closingToHours, closingToMinutes, fromDay, openingFromHours,
                    openingFromMinutes, openingToHours, openingToMinutes, toDay);
        }
    }
}
