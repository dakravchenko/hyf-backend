package com.week3.enumtask;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentMethodTest {

    // private PaymentMethod paymentMethod;
    // @BeforeEach
    // void setUp(){
    //     paymentMethod = new PaymentMethod();
    // }
    // @Test
    // void BankTransferDoesntHaveFee() {
    //     assertEquals(0.0, PaymentMethod.CREDIT_CARD.calculateFee(200.0));
    // }

    @Test
    void callingGetDisplayNameonEnumReturnsItsName() {
        assertEquals("iDEAL", PaymentMethod.IDEAL.getDisplayName());
    }

    @Test
    void testValueOf() {

    }

    @Test
    void testValues() {

    }
}
