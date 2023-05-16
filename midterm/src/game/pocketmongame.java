//2313 오준서
package game;

import java.util.Scanner;

public class pocketmongame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pocketmon pocketmon = null;
        int menu;

        System.out.println("포켓몬 게임 시작!");
        while (true){
            System.out.println("메뉴");
            System.out.println("1.포켓몬 생성");
            System.out.println("2.내 포켓몬 정보 확인");
            System.out.println("3.내 포켓몬 진화");
            System.out.println("4.다른 포켓몬 공격");
            System.out.println("5.종류");
            System.out.println("번호 선택 :");
            menu = scanner.nextInt();

            switch (menu){
                case 1 :
                    System.out.print("포켓몬 이름 입력 : ");
                    String name = scanner.next();
                    System.out.print("포켓몬 레벨 입력 : ");
                    int level = scanner.nextInt();
                    pocketmon = new Pocketmon(name, level);
                    System.out.println(pocketmon.getName()+"포켓몬 생성!");
                    break;
                case 2 :
                    if(pocketmon == null){
                        System.out.println("포켓몬을 가지고 있지 않습니다!\n");

                    }else {
                        System.out.println("이름 : " + pocketmon.getName());
                        System.out.println("레벨 : " + pocketmon.getLevel());
                        System.out.println("체력 : " + pocketmon.getHp()+"\n");
                    }
                    break;
                case 3 :
                    if(pocketmon == null) {
                        System.out.println("포켓몬을 가지고 있지 않습니다!\n");
                    }else {
                        pocketmon.evolve();
                        System.out.println(pocketmon.getName()+" 진화함!");
                    }
                        break;
                case 4 :
                    if(pocketmon == null) {
                        System.out.println("포켓몬을 가지고 있지 않습니다!\n");
                    }else {
                    Pocketmon target = new Pocketmon(name = "파이리" ,level = 5);
                    pocketmon.attack(target);
                        System.out.println(pocketmon.getName()+"이(가)"+target.getName());

                    }

                    break;
                case 5 :
                    System.out.println("게임 종료!");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요!");
            }
        }
    }
}
