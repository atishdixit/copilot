package com.copilot.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getInvoice() {
        Invoice invoice =  new Invoice();
        assertEquals("Invoice", invoice.getInvoice());
    }

    @Test
    void addInvoice() {
        Invoice invoice = new Invoice();
        invoice.addInvoice();

    }

    @Test
    void updateInvoice() {
        Invoice invoice = new Invoice();
        invoice.updateInvoice();
    }
}