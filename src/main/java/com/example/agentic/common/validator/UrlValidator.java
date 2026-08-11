package com.example.agentic.common.validator;

import java.net.URI;

public final class UrlValidator {

    private UrlValidator() {
    }

    public static boolean isValid(String url) {

        try {

            URI uri = new URI(url);

            return uri.getScheme() != null
                    && uri.getHost() != null;

        } catch (Exception ex) {

            return false;
        }
    }
}