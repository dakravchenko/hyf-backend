package com.delivery.model;

import com.delivery.interfaces.Trackable;

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
