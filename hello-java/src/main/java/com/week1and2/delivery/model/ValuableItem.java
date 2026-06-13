package com.week1and2.delivery.model;

import com.week1and2.delivery.interfaces.Insurable;
import com.week1and2.delivery.interfaces.Trackable;

public class ValuableItem implements Trackable, Insurable {
    private String trackingId;
    private String status;
    private double value;

    public ValuableItem(String trackingId, String status, double value) {
        this.status = status;
        this.trackingId = trackingId;
        this.value = value;
    }

    @Override
    public String getTrackingId() {
        return trackingId;
    }

    @Override
    public String getCurrentStatus() {
        return status;
    }

    @Override
    public double calculateInsurance() {
        return value * 0.02;
    }

    @Override
    public boolean isCovered() {
        if (value < 100000000) {
            return true;
        } else {
            return false;
        }
    }
}
