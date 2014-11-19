/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jhlee
 */
public class RentalFormValidator{
    private HttpServletRequest formRequest;
    private ArrayList<Integer> errorCodes;
//    ArrayList<Error> errorList;
//    Error error;
    

    public RentalFormValidator(HttpServletRequest formRequest) {
        this.formRequest = formRequest;
        this.errorCodes = new ArrayList<Integer>();
//        this.errorList = new ArrayList<Error>();
    }
    
    public boolean isValid(){
//        isNull();
        RentalBean rentalBean = new RentalBean();
        PriceSchedule priceSchedule = new PriceSchedule();
        
        //not null & number format exception 
        try {
            rentalBean.setCustomerNumber(formRequest.getParameter("customerNo"));
            if (rentalBean.getCustomerNumber().isEmpty()) {
                errorCodes.add(1011);
            } 
        } catch (NumberFormatException e) {
            errorCodes.add(1012);
        }

        // not null & 1 to 31
        rentalBean.setPickupDay(Integer.parseInt(formRequest.getParameter("pickupDay")));
        if (formRequest.getParameter("pickupDay").isEmpty()) {
            errorCodes.add(1021);
        } else if (rentalBean.getPickupDay() < 1 || rentalBean.getPickupDay() > 31) {
            errorCodes.add(1022);
        }
        // not null & 1 to 12
        rentalBean.setPickupMon(Integer.parseInt(formRequest.getParameter("pickupMonth")));
        // not null & 2014 or 2015
        rentalBean.setPickupYear(Integer.parseInt(formRequest.getParameter("pickupYear")));
        // not null & 0 to 23
        rentalBean.setPickupHour(Integer.parseInt(formRequest.getParameter("pickupHour")));
        rentalBean.setDropoffDay(Integer.parseInt(formRequest.getParameter("dropoffDay")));
        rentalBean.setDropoffMon(Integer.parseInt(formRequest.getParameter("dropoffMonth")));
        rentalBean.setDropoffYear(Integer.parseInt(formRequest.getParameter("dropoffYear")));
        rentalBean.setDropoffHour(Integer.parseInt(formRequest.getParameter("dropoffHour")));
        rentalBean.setCardType(formRequest.getParameter("creditCardType"));
        rentalBean.setCardNumber(formRequest.getParameter("creditCardNo"));
        
        priceSchedule.setTypeName(formRequest.getParameter("cartype"));
        priceSchedule.setWeekdayRate(BigDecimal.ZERO);
        priceSchedule.setWeekendRate(BigDecimal.ZERO);
        priceSchedule.setWeeklyRate(BigDecimal.ZERO);
        
        rentalBean.setPriceSchedule(priceSchedule);
        
        return false;
    }

    public void setErrorCodes(ArrayList<Integer> errorCodes) {
        this.errorCodes = errorCodes;
    }
    
    public ArrayList<Integer> getErrors(){
        
        return errorCodes;
    }
    
    
    
//
//    private void isNull() {
//        error = new Error();
//        if (formRequest.getParameter("customerNo").isEmpty()) {
//            error.setErrorCode(1011);
//            error.setErrorDesc("Customer Number is empty.");
//            errorList.add(error);
////            errorCodes.add(1011);
//        }
//        if (formRequest.getParameter("pickupDay").isEmpty()) {
//            error.setErrorCode(1012);
//            error.setErrorDesc("Pickup Day is empty.");
//            errorList.add(error);
////            errorCodes.add(1021);
//        }
//        if (formRequest.getParameter("pickupMonth").isEmpty()) {
////            errorCodes.add(1031);
//            error.setErrorCode(1031);
//            error.setErrorDesc("Pickup Month is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("pickupYear").isEmpty()) {
////            errorCodes.add(1041);
//            error.setErrorCode(1041);
//            error.setErrorDesc("Pickup Year is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("pickupHour").isEmpty()) {
////            errorCodes.add(1051);
//            error.setErrorCode(1051);
//            error.setErrorDesc("Pickup Hour is empty.");
//        }
//        if (formRequest.getParameter("dropoffDay").isEmpty()) {
////            errorCodes.add(1061);
//            error.setErrorCode(1061);
//            error.setErrorDesc("Dropoff Day is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("dropoffMonth").isEmpty()) {
////            errorCodes.add(1071);
//            error.setErrorCode(1071);
//            error.setErrorDesc("Dropoff Month is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("dropoffYear").isEmpty()) {
////            errorCodes.add(1081);
//            error.setErrorCode(1081);
//            error.setErrorDesc("Dropoff Year is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("dropoffHour").isEmpty()) {
////            errorCodes.add(1091);
//            error.setErrorCode(1091);
//            error.setErrorDesc("Dropoff Hour is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("cartype").isEmpty()) {
////            errorCodes.add(1101);
//            error.setErrorCode(1101);
//            error.setErrorDesc("Car Type is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("creditCartType").isEmpty()) {
////            errorCodes.add(1111);
//            error.setErrorCode(1111);
//            error.setErrorDesc("Credit Card Type is empty.");
//            errorList.add(error);
//        }
//        if (formRequest.getParameter("creditCardNo").isEmpty()) {
////            errorCodes.add(1121);
//            error.setErrorCode(1121);
//            error.setErrorDesc("Credit Card Number is empty.");
//            errorList.add(error);
//        }
//        
//    }
//    
//    private void isFormatErrors() {
//        error = new Error();
//        int pickupDay = Integer.parseInt(formRequest.getParameter("pickupDay"));
//        int dropoffDay = Integer.parseInt(formRequest.getParameter("dropoffDay"));
//        int pickupMonth = Integer.parseInt(formRequest.getParameter("pickupMonth"));
//        int pickupYear = Integer.parseInt(formRequest.getParameter("pickupYear"));
//        int pickupHour = Integer.parseInt(formRequest.getParameter("pickupHour"));
//        try {
//            int custNo = Integer.parseInt(formRequest.getParameter("customerNo"));
//        } catch (NumberFormatException e) {
//            error.setErrorCode(1012);
//            error.setErrorDesc("Customer Number has to be numeric value");
//            errorList.add(error);
//        }
//        if (pickupDay < 1 || pickupDay > 31) {
//            error.setErrorCode(1022);
//            error.setErrorDesc("Day has to be in between 1 to 31");
//            errorList.add(error);
//        }
//        if (pickupMonth < 1 || pickupMonth > 12) {
//            error.setErrorCode(1032);
//            error.setErrorDesc("Month has to be in between 1 to 12");
//            errorList.add(error);
//        }
//        if (pickupYear == 2014 || pickupYear == 2015) {
//            error.setErrorCode(1042);
//            error.setErrorDesc("Year has to be 2014 or 2015");
//            errorList.add(error);
//        }
//        if (pickupHour < 0 || pickupHour > 23) {
//            error.setErrorCode(1052);
//            error.setErrorDesc("Hour has to be in between 0 to 23");
//            errorList.add(error);
//        }
//        if (pickupHour < 0 || pickupHour > 23) {
//            error.setErrorCode(1052);
//            error.setErrorDesc("Hour has to be in between 0 to 23");
//            errorList.add(error);
//        }
//        if (dropoffDay < 1 || dropoffDay > 31) {
//            error.setErrorCode(1062);
//            error.setErrorDesc("Day has to be in between 1 to 31");
//            errorList.add(error);
//        }
//        if (pickupMonth < 1 || pickupMonth > 12) {
//            error.setErrorCode(1032);
//            error.setErrorDesc("Month has to be in between 1 to 12");
//            errorList.add(error);
//        }
//        if (pickupYear == 2014 || pickupYear == 2015) {
//            error.setErrorCode(1042);
//            error.setErrorDesc("Year has to be 2014 or 2015");
//            errorList.add(error);
//        }
//        if (pickupHour < 0 || pickupHour > 23) {
//            error.setErrorCode(1052);
//            error.setErrorDesc("Hour has to be in between 0 to 23");
//            errorList.add(error);
//        }
//        if (pickupHour < 0 || pickupHour > 23) {
//            error.setErrorCode(1052);
//            error.setErrorDesc("Hour has to be in between 0 to 23");
//            errorList.add(error);
//        }
//        
//            
//    }
}
