package com.keyin.entities;

public class Publisher {

    private String publisherName;

    private String publisherLocation;

    private int publisherValue;

    public Publisher(String publisherName, String publisherLocation, int publisherValue) {
        this.publisherName = publisherName;
        this.publisherLocation = publisherLocation;
        this.publisherValue = publisherValue;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherLocation() {
        return publisherLocation;
    }

    public void setPublisherLocation(String publisherLocation) {
        this.publisherLocation = publisherLocation;
    }

    public int getPublisherValue() {
        return publisherValue;
    }

    public void setPublisherValue(int publisherValue) {
        this.publisherValue = publisherValue;
    }
}
