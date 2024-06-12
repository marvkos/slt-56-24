package at.technikum;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTranslatorTest {

    @Test
    void when_localeGerman_then_greetingHallo() {
        // Arrange
        Locale locale = Locale.GERMAN;
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        // Act
        String greeting = greetingTranslator
                .getGreeting(locale);

        // Assert
        assertEquals("Hallo", greeting);
    }

    @Test
    void when_localeEnglish_then_greetingHello() {
        // Arrange
        Locale locale = Locale.ENGLISH;
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        // Act
        String greeting = greetingTranslator
                .getGreeting(locale);

        // Assert
        assertEquals("Hello", greeting);
    }

    @Test
    void when_localeUnsupported_then_unsupportedException() {
        // Arrange
        Locale locale = Locale.ITALIAN;
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        assertThrows(
                IllegalArgumentException.class,
                () -> greetingTranslator.getGreeting(locale)
        );
    }
}