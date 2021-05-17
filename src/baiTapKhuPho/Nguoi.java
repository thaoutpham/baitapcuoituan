package baiTapKhuPho;

import java.util.Scanner;

public class Nguoi {
    String name;
    int age;
    String job;
    int id;
    public Nguoi(String name, int age, String job, int id) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.id = id;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten");
        name= scanner.nextLine();
        System.out.println("nhap tuoi");
        age=scanner.nextInt();
        System.out.println("nhap cong viec");
        job=scanner.nextLine();
        System.out.println("so chung minh nhan dan");
        id= scanner.nextInt();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ten la: " + name + ", tuoi la: " + age + ", so chung minh thu la: " + id + ", cong viec la: " + job;
    }
}
