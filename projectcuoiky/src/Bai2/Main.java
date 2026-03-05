package Bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list = String.valueOf(new ArrayList<>());
        int count = 1;
        System.out.println("Mời nhập danh sách chuỗi email:(Nhập chuỗi)");
        list = sc.nextLine();
        System.out.println("Danh sách email đã nhập: " + list);
        String[] emails = list.split(";");
        Map<Integer, String> emailMap = new HashMap<>();
        for (int i = 0; i < emails.length; i++) {


            if( emails[i].trim().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") && !emails[i].isEmpty()  ){
                emailMap.put(count, emails[i].trim());
                count++;
            }
        }

        //dem tong so email nhap vao

        System.out.println("Tổng số email đã nhập: " + emails.length);

        //dem tong so email hop le

        System.out.println("Tổng số email hợp lệ: " + emailMap.size());

        //dem tong so email khong hop le

        System.out.println("Tổng số email không hợp lệ: " + (emails.length - emailMap.size()));

        //sap xep email hop le theo thu tu alphabet
        System.out.println("Danh sách email hợp lệ đã sắp xếp: ");
        emailMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getValue()));
    }
}



