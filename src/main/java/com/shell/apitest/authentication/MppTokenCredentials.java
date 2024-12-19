/*
 * ShellSmartPayAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.authentication;

/**
 * Interface for defining the behavior of CustomHeader Authentication.
 */
public interface MppTokenCredentials {

    /**
     * String value for authorization.
     * @return authorization
     */
    String getAuthorization();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param authorization String value for credentials.
     * @return true if credentials matched.
     */
    boolean equals(String authorization);
}
