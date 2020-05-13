package com.example.praytimes.Model_for_api;

import com.example.praytimes.MainActivity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Muslim_Salat {
    @SerializedName("title")
    private String title;
    @SerializedName("query")
    private String query;
    @SerializedName("for")
    private String _for;
    @SerializedName("method")
    private Integer method;
    @SerializedName("prayer_method_name")
    private String prayerMethodName;
    @SerializedName("daylight")
    private String daylight;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("map_image")
    private String mapImage;
    @SerializedName("sealevel")
    private String sealevel;
    @SerializedName("today_weather")
    private TodayWeather todayWeather;
    @SerializedName("link")
    private String link;
    @SerializedName("qibla_direction")
    private String qiblaDirection;
    @SerializedName("latitude")
    private String latitude;
    @SerializedName("longitude")
    private String longitude;
    @SerializedName("address")
    private String address;
    @SerializedName("city")
    private String city;
    @SerializedName("state")
    private String state;
    @SerializedName("postal_code")
    private String postalCode;
    @SerializedName("country")
    private String country;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("items")
    private List<Item> items = null;
    @SerializedName("status_valid")
    private Integer statusValid;
    @SerializedName("status_code")
    private Integer statusCode;
    @SerializedName("status_description")
    private String statusDescription;

    public Muslim_Salat(String title, String query, String _for, Integer method, String prayerMethodName, String daylight, String timezone, String mapImage, String sealevel, TodayWeather todayWeather, String link, String qiblaDirection, String latitude, String longitude, String address, String city, String state, String postalCode, String country, String countryCode, List<Item> items, Integer statusValid, Integer statusCode, String statusDescription) {
        this.title = title;
        this.query = query;
        this._for = _for;
        this.method = method;
        this.prayerMethodName = prayerMethodName;
        this.daylight = daylight;
        this.timezone = timezone;
        this.mapImage = mapImage;
        this.sealevel = sealevel;
        this.todayWeather = todayWeather;
        this.link = link;
        this.qiblaDirection = qiblaDirection;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.countryCode = countryCode;
        this.items = items;
        this.statusValid = statusValid;
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
    }

    public Muslim_Salat(MainActivity mainActivity, List<Item> itemList) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFor() {
        return _for;
    }

    public void setFor(String _for) {
        this._for = _for;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(Integer method) {
        this.method = method;
    }

    public String getPrayerMethodName() {
        return prayerMethodName;
    }

    public void setPrayerMethodName(String prayerMethodName) {
        this.prayerMethodName = prayerMethodName;
    }

    public String getDaylight() {
        return daylight;
    }

    public void setDaylight(String daylight) {
        this.daylight = daylight;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getMapImage() {
        return mapImage;
    }

    public void setMapImage(String mapImage) {
        this.mapImage = mapImage;
    }

    public String getSealevel() {
        return sealevel;
    }

    public void setSealevel(String sealevel) {
        this.sealevel = sealevel;
    }

    public TodayWeather getTodayWeather() {
        return todayWeather;
    }

    public void setTodayWeather(TodayWeather todayWeather) {
        this.todayWeather = todayWeather;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getQiblaDirection() {
        return qiblaDirection;
    }

    public void setQiblaDirection(String qiblaDirection) {
        this.qiblaDirection = qiblaDirection;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Integer getStatusValid() {
        return statusValid;
    }

    public void setStatusValid(Integer statusValid) {
        this.statusValid = statusValid;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

}

