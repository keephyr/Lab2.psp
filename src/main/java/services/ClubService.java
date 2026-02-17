package services;
import objects.Member;
import objects.Coach;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class ClubService {

    private static void ShowAll(List<Member> list){
        for(Member member: list){
            System.out.println(member);
        }
    }

    private static void EditMember(List<Member> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID человека кого изменить: ");
        int id = scanner.nextInt();
        try {
            list.get(id-1).Edit();
        } catch (Exception e) {
            System.out.println("Такого пользователя нет");
        }
    }

    private static void SearchMember(List<Member> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что надо найти: ");
        String search = scanner.nextLine();

        for(Member member: list){
            List<String> MemberList = member.Info();
            if (MemberList.contains(search)){
                System.out.println(member);
            }
        }
    }

    private static List<Member> DeleteMember(List<Member> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID пользователя которого надо удалить: ");
        int ID = scanner.nextInt();
        list.remove(ID-1);
        return list;
    }

    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member member1 = new Member("1","2",3,"4");
        Coach coach1 = new Coach("11","22",33,"44",55,"66");

        list.add(member1);
        list.add(coach1);
        ShowAll(list);
//        EditMember(list);
//        coach1.Edit();
        list = DeleteMember(list);
        ShowAll(list);
        SearchMember(list);

    }
}