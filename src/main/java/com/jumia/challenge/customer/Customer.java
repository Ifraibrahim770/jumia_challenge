package com.jumia.challenge.customer;


import org.springframework.lang.NonNull;

public class Customer {

    @NonNull
    private final int id;
    @NonNull
    private final String name;
    @NonNull
    private final String phone;


    private String state;
    private String country;
    private String countryCode;
    private String number;

    public Customer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        validateCountry(phone);
    }

    private void validateCountry(String phone) {
        String[] phoneSections = phone.split(" ");
        if (phoneSections.length == 2) {
            String phoneCountryCode = "+" + phoneSections[0].substring(1, phoneSections[0].length() - 1);
            String phoneNumber = phoneSections[1];
            boolean valid = false;
            if (phone.matches("\\(237\\) ?[2368]\\d{7,8}$")) {
                valid = true;
                this.country = "Cameroon";
            } else if (phone.matches("\\(251\\) ?[1-59]\\d{8}$")) {
                valid = true;
                this.country = "Ethiopia";
            } else if (phone.matches("\\(212\\) ?[5-9]\\d{8}$")) {
                valid = true;
                this.country = "Morocco";
            } else if (phone.matches("\\(258\\) ?[28]\\d{7,8}$")) {
                valid = true;
                this.country = "Mozambique";
            } else if (phone.matches("\\(256\\) ?\\d{9}$")) {
                valid = true;
                this.country = "Uganda";
            }

            if (valid) {
                this.state = "VALID";
                this.countryCode = phoneCountryCode;
                this.number = phoneNumber;
                return;
            }
        }
        this.state = "INVALID";
        this.country = "UNKNOWN";
    }

    public int getId() {
        return id;
    }

    @NonNull
    public String getState() {
        return state;
    }

    public void setState(@NonNull String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getNumber() {
        return number;
    }
}