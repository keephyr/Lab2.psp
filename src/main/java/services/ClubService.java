package services;
import objects.Member;
import objects.Coach;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class ClubService {

    private static void ShowAll(List<Member> list){
        for(Member member: list){
            System.out.println(member);
            System.out.println(member.getName());
        }
    }

    private static void EditMember(List<Member> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека кого изменить: ");
        String name = scanner.nextLine();

        for(Member member: list){
            if(member.getName().equals(name)){
                member.Edit();
            }
        }
    };

    public static void main(String[] args) {
        List<Member> list = new ArrayList<Member>();
        Member member1 = new Member("1","2",3,"4");
        Coach coach1 = new Coach("11","22",33,"44",55,"66");

        list.add(member1);
        list.add(coach1);
        ShowAll(list);
        EditMember(list);
//        member1.Edit();
        ShowAll(list);
    }
}