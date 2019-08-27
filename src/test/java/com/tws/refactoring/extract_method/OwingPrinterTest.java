package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_print_total_amount_when_print_price_given_name_cao_and_orders() {
     //given
     double[] amounts = {60.0, 6.0};
     String name = "cao";
     Orders orders = new Orders(amounts);
     OwingPrinter owingPrinter = new OwingPrinter();
     //when
     owingPrinter.printOwing(name, orders);
     String expect = "*****************************\r\n" + 
          "****** Customer totals ******\r\n" + 
          "*****************************\r\n" +
          "name: cao\r\n" + 
          "amount: 66.0\r\n";
     //then
     assertEquals(expect, outContent.toString());
    }
}