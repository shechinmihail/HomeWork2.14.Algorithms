package com.example.homework2_14_algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private StringListImpl expected;

    private StringListImpl actual;

    @BeforeEach
    public void setUp() {
        expected = new StringListImpl(5);
        String string1 = "test1";
        String string2 = "test2";
        String string3 = "test3";
        String string4 = "test4";
        String string5 = "test5";
        expected.add(string1);
        expected.add(string2);
        expected.add(string3);
        expected.add(string4);
        expected.add(string5);
        actual = new StringListImpl(5);
        actual.add(string1);
        actual.add(string2);
        actual.add(string3);
        actual.add(string4);
        actual.add(string5);
    }

    @Test
    void add() {
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAddIndex() {
        expected.add(1, "test1");
        actual.add(1, "test1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void set() {
        expected.set(3, "testing 1");
        actual.set(3, "testing 1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void remove() {
        expected.remove("test2");
        actual.remove("test2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testRemoveIndex() {
        expected.remove("test2");
        actual.remove("test2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void contains() {
        Assertions.assertTrue(actual.contains("test1"));
    }

    @Test
    void indexOf() {
        expected.indexOf("test2");
        actual.indexOf("test2");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void lastIndexOf() {
        expected.lastIndexOf("test1");
        actual.lastIndexOf("test1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void get() {
        expected.get(1);
        actual.get(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        expected.equals("test1");
        expected.equals("test1");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void size() {
        expected.size();
        actual.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        expected.isEmpty();
        actual.isEmpty();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void clear() {
        expected.clear();
        actual.clear();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void toArray() {
        expected.toArray();
        actual.toArray();
        Assertions.assertEquals(expected, actual);
    }
}