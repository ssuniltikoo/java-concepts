//package dev.core.concepts.java.lamdas;
//
//import java.util.Comparator;
//
//public class Client {
//    public static void main(String[] args) {
//        System.out.println("lambdas starting **");
//
//        TaxPayment taxPayment = new TaxPayment();
//
//
//        PayTax middleClassPayTax = new PayTax() {
//            @Override
//            public String taxPayment() {
//                System.out.println("tax payment initiated from anonymus class");
//            }
//        };
//
//        middleClassPayTax.taxPayment();
//
//        PayTax middleClassPayMoreTaxToGovt = new TaxPayment();
//        middleClassPayMoreTaxToGovt.taxPayment();
//
//
//        PayTax p1 = ()->  System.out.println("*********TAX FROM INTERFACE************");
//
//        System.out.println(p1.toString());
//       // middleClassPayMoreTax.taxPayment();
//
//        Comparator<String> compareSTring = (a,b)->a.length()-b.length();
//
//        System.out.println(compareSTring.compare("123","121"));
//
//
//
//    }
//}
