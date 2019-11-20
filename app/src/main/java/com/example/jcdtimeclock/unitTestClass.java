package com.example.jcdtimeclock;
import com.google.common.truth.Truth.assertThat;
import org.junit.Test;


public class unitTestClass {
    @Test
    public boolean assertEquals(int total, int num1, int num2) {
        if (num1 + num2 == total) {
            return true;
        }
        else
            return false;
    }
}
