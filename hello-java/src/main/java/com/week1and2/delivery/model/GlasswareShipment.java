package com.week1and2.delivery.model;

import com.week1and2.delivery.interfaces.Fragile;
import com.week1and2.delivery.interfaces.Insurable;
import com.week1and2.delivery.interfaces.Trackable;

public class GlasswareShipment implements Trackable, Insurable, Fragile {
    private String trackingId;
    private String status;
    private double value;
    private int maxStack;

    public GlasswareShipment(String trackingId, String status, double value, int maxStack) {
        this.status = status;
        this.trackingId = trackingId;
        this.value = value;
        this.maxStack = maxStack;
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
        return value * 0.76;
    }

    @Override
    public boolean isCovered() {
        if (value < 10000000) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getHandlingInstructions() {
        return "be careful";
    }

    @Override
    public int getMaxStackHeight() {
        return maxStack;
    }
}
