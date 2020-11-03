//package ru.geekbrains.lesson_4.converter;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Main {
//    public static void main(String[] args) {
////                    I, II, III,
////                    IV, V,
////                    VI, VII, VIII,
////                    IX, X,
////                    XI, XII, XIII,
////                    XIV, XV,
////                    XI, XVII, XVIII,
////                    XIX, XX
//        HashMap<Integer, String> roman = new HashMap();
//        roman.put(1, "I");
//        roman.put(5, "V");
//        roman.put("X", 10);
//        roman.put("L", 50);//50
//        roman.put("C", 100);//100
//        roman.put("D", 500);//500
//        roman.put("M", 1000);//1000
//        System.out.println(intToRoman(roman, 10));
//
//    }
//
//    private static String intToRoman(Map m, int num) {
//        if (num == 0){
//            return "wrong number";
//        }
//        StringBuilder sb = new StringBuilder();
//        String s = null;
//        for (int i = 0; i < num; i++) {
//            int j;
//            if (num <= 3){
//                j = 1;
//                s = sb.append(m.get(j)).toString();
//            } else if (num > 3 && num < 7){
//                j = 5;
//                s = sb.append(m.get(j)).toString();
//            }
//        }
//        return s;
//    }
//}
