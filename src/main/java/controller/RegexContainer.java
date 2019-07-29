package controller;

public interface RegexContainer {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    // Latin name
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_NAME = "[\\w]{3,10}";
    String REGEX_DATA = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
    String REGEX_SIZE="(\\d){1,100}";


}

