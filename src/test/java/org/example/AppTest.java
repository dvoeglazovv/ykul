package org.example.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    @DisplayName("Проверка примера из Main: буквы меняются, символы на местах")
    void testReverseLettersMainCase() {
        String input = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123";
        assertEquals(expected, StringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Должен возвращать пустую строку для null или пустой строки")
    void testEmptyAndNull() {
        assertEquals("", StringUtil.reverseLetters(""));
        assertEquals("", StringUtil.reverseLetters(null));
    }

    @Test
    @DisplayName("Строка без букв должна остаться без изменений")
    void testNoLetters() {
        String input = "123!@#$";
        assertEquals(input, StringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Простая строка из одних букв")
    void testOnlyLetters() {
        assertEquals("dcba", StringUtil.reverseLetters("abcd"));
    }
}