package com.delivery.model;

import com.delivery.interfaces.Insurable;
import com.delivery.interfaces.Trackable;

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
