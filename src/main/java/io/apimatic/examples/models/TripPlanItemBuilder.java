/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package io.apimatic.examples.models;

import java.util.*;

public class TripPlanItemBuilder {
    //the instance to build
    private TripPlanItem tripPlanItem;

    /**
     * Default constructor to initialize the instance
     */
    public TripPlanItemBuilder() {
        tripPlanItem = new TripPlanItem();
    }

    public TripPlanItemBuilder id(String id) {
        tripPlanItem.setId(id);
        return this;
    }

    public TripPlanItemBuilder refType(String refType) {
        tripPlanItem.setRefType(refType);
        return this;
    }

    public TripPlanItemBuilder estimatePrice(Double estimatePrice) {
        tripPlanItem.setEstimatePrice(estimatePrice);
        return this;
    }

    public TripPlanItemBuilder transitType(String transitType) {
        tripPlanItem.setTransitType(transitType);
        return this;
    }

    public TripPlanItemBuilder estimateTime(String estimateTime) {
        tripPlanItem.setEstimateTime(estimateTime);
        return this;
    }

    public TripPlanItemBuilder contentId(String contentId) {
        tripPlanItem.setContentId(contentId);
        return this;
    }

    public TripPlanItemBuilder name(String name) {
        tripPlanItem.setName(name);
        return this;
    }

    public TripPlanItemBuilder imageUrl(String imageUrl) {
        tripPlanItem.setImageUrl(imageUrl);
        return this;
    }

    public TripPlanItemBuilder region(String region) {
        tripPlanItem.setRegion(region);
        return this;
    }

    public TripPlanItemBuilder province(String province) {
        tripPlanItem.setProvince(province);
        return this;
    }

    public TripPlanItemBuilder sequence(String sequence) {
        tripPlanItem.setSequence(sequence);
        return this;
    }

    public TripPlanItemBuilder tripDay(String tripDay) {
        tripPlanItem.setTripDay(tripDay);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TripPlanItem build() {
        return tripPlanItem;
    }
}