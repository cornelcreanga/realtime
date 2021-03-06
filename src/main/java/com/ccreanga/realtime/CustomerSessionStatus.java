package com.ccreanga.realtime;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomerSessionStatus {

    private CustomerSession customerSession;
    boolean alreadyLoggedIn;

    public CustomerSession getCustomerSession() {
        return customerSession;
    }

    public boolean isAlreadyLoggedIn() {
        return alreadyLoggedIn;
    }
}
