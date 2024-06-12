package at.technikum;

import java.util.Locale;

public class GreetingTranslator {

    public String getGreeting(Locale locale) {
    if (Locale.GERMAN == locale) {
            return "Hallo";
        }

        if (Locale.ENGLISH == locale) {
            return "Hello";
        }

        throw new IllegalArgumentException(
                "Unsupported language"
        );
    }
}
