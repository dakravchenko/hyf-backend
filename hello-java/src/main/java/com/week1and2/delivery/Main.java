package com.week1and2.delivery;

import com.week1and2.delivery.interfaces.Trackable;
import com.week1and2.delivery.model.GlasswareShipment;
import com.week1and2.delivery.model.StandardParcel;
import com.week1and2.delivery.model.ValuableItem;

public class Main {
    public static void main(String[] args) {
        StandardParcel sp = new StandardParcel("11", "in transit");
        ValuableItem vi = new ValuableItem("22", "delivered", 20000000000.89);
        GlasswareShipment gs = new GlasswareShipment("33", "broken", 333333.99, 9);

        Trackable[] parcels = new Trackable[] { sp, vi, gs };

        Trackable.printAllStatuses(parcels);

        System.out.println(vi.insuranceSummary());
        System.out.println(gs.insuranceSummary());
    }
}
