package com.bagirapp.studentguideinszeged;

/**
 * Created by User on 2018.03.23..
 */

public class Place {
    private String name;
    private String address;
    private String phone;
    private String email;
    private int imageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String address) {
        this.name = name;
        this.address = address;
        this.imageResourceId = NO_IMAGE_PROVIDED;
    }

    public Place(String name, String address, String phone, String email, int imageResourceId) {
        this(name, address);
        this.phone = phone;
        this.email = email;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
