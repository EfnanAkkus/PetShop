package com.example.petshop.Common;

public class Common {

    public static final String rate_detail_th1="RateDetails";
    public static final String user_custom_tb1="CustomInformation";

    public static boolean isCustomerFound=false;
    public static String customerId= "";


    public Common() {

    }

    public static String getRate_detail_th1() {
        return rate_detail_th1;
    }

    public static String getUser_custom_tb1() {
        return user_custom_tb1;
    }

    public static boolean isIsCustomerFound() {
        return isCustomerFound;
    }

    public static void setIsCustomerFound(boolean isCustomerFound) {
        Common.isCustomerFound = isCustomerFound;
    }

    public static String getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(String customerId) {
        Common.customerId = customerId;
    }
}
