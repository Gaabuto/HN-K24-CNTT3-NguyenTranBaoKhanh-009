package Bai1;

import java.util.*;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> list = new ArrayList<>();

        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Số n phải lớn hơn 0.");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập số thứ " + (i + 1) + ": ");
            list.add(sc.nextDouble());
        }


        // a
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += list.get(i);
        }

        System.out.println("Tổng các giá trị hàng hóa: " + total);


        // b
        double avg = (double) total / list.size();
        System.out.println("Trung bình: " + avg);


        //c
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(list.get(i) > 1000000){
                count++;
            }
        }
        System.out.println("Số sản phẩm có giá >1000000: " + count);

        //d
        count = 0;

        for (int i = 0; i < n; i++) {
            if (list.get(i) < 1000000) {
                count++;
            }
        }
        System.out.println("Số sản phẩm có giá <1000000: " + count);

        // e

        Set<Double> set = new LinkedHashSet<>(list);
        List<Double> uniqueList = new ArrayList<>(set);

        //f
        System.out.println("Các số đã được loại trùng: " + uniqueList);

        //g

        int numberOfPrice = uniqueList.size();
        System.out.println("Số mức giá khác nhau: " + numberOfPrice);

    }
}
