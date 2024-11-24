import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1 Лабораторная
//        Scanner sc = new Scanner(System.in);
//        dList<Minion> list = new dList<>();
//        Minion minion1 = new Minion("AA", "AB");
//        Minion minion2 = new Minion("BB", "BC");
//        Minion minion3 = new Minion("CC", "CD");
//        Minion minion4 = new Minion("DD", "DE");
//        Minion minion5 = new Minion("ZO", "KO");
//
//        list.insertT(minion1);
//        list.insertT(minion2);
//        list.insertT(minion3);
//        list.insertH(minion4);
//        list.insertH(minion5);
//        list.show();
//        Minion minion6 = new Minion("HH", "OO");
//        list.edit(minion3,minion6);
//        list.show();
//        list.remove(minion1);
//        list.show();
//        list.removeH();
//        list.show();
//        list.removeT();
//        list.show();
//        2 Лабораторная
        Scanner sc = new Scanner(System.in);
        Minion minion1 = new Minion("Nikita", "Gusev");
        Minion minion2 = new Minion("Nikita", "Vasilyev");
        Minion minion3 = new Minion("Anton", "Kovalenko");
        Minion minion4 = new Minion("Anton", "Kovac");
        Minion minion5 = new Minion("Vasily", "Popov");
//        Stack<Minion> stack = new Stack<>();
//        stack.push(minion1);
//        stack.push(minion2);
//        stack.push(minion3);
//        stack.push(minion4);
//        stack.push(minion5);
//        for(Minion el : stack){
//            System.out.println(el);
//        }
//
//        dList<Minion> list = new dList<>();
//
//        list.insertT(minion1);
//        list.insertT(minion2);
//        list.insertT(minion3);
//        list.insertT(minion4);
//        list.insertT(minion5);
//        for(Minion el : list) System.out.println(el);
//        System.out.println();
//        try{
//            System.out.println(list.take(1));
//            System.out.println(list.take(3));
//        } catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        ArrayList<Minion> minionList = new ArrayList<>();
        minionList.add(minion1);
        minionList.add(minion2);
        minionList.add(minion3);
        minionList.add(minion4);
        minionList.add(minion5);
        minionList.sort(new MinionComparator());
        for (Minion el : minionList){
            System.out.println(el);
        }

    }
}