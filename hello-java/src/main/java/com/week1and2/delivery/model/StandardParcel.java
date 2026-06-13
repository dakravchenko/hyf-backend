package com.week1and2.delivery.model;

import com.week1and2.delivery.interfaces.Trackable;

public class StandardParcel implements Trackable {
    private String trackingId;
    private String status;

    public StandardParcel(String trackingId, String status) {
        this.trackingId = trackingId;
        this.status = status;
    }

    @Override
    public String getTrackingId() {
        return trackingId;
    }

    @Override
    public String getCurrentStatus() {
        return status;
    }

}
