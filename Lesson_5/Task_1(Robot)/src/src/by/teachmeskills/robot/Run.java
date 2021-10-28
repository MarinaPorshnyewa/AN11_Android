package src.src.by.teachmeskills.robot;

import src.by.teachmeskills.robot.hands.IHand;
import src.by.teachmeskills.robot.hands.SamsungHands;
import src.by.teachmeskills.robot.hands.SonyHands;
import src.by.teachmeskills.robot.hands.ToshibaHands;
import src.by.teachmeskills.robot.heads.IHead;
import src.by.teachmeskills.robot.heads.SamsungHead;
import src.by.teachmeskills.robot.heads.SonyHead;
import src.by.teachmeskills.robot.heads.ToshibaHead;
import src.by.teachmeskills.robot.legs.ILeg;
import src.by.teachmeskills.robot.legs.SamsungLegs;
import src.by.teachmeskills.robot.legs.SonyLegs;
import src.by.teachmeskills.robot.legs.ToshibaLegs;

public class Run {
    public static void print(Robot robot){
        robot.action();
        System.out.println("Цена робота " + robot.getPrice());
        System.out.println();
    }
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        IHand samsungHands = new SamsungHands(200);
        IHand sonyHands = new SonyHands(250);
        IHand toshibaHands = new ToshibaHands(150);

        IHead samsungHead = new SamsungHead(300);
        IHead sonyHead = new SonyHead(350);
        IHead toshibaHead = new ToshibaHead(250);

        ILeg samsungLegs = new SamsungLegs(220);
        ILeg sonyLegs = new SonyLegs(280);
        ILeg toshibaLegs = new ToshibaLegs(160);

        Robot robot_1 = new Robot(sonyHead, samsungHands, toshibaLegs);
        Robot robot_2 = new Robot(samsungHead, toshibaHands, samsungLegs);
        Robot robot_3 = new Robot(toshibaHead, sonyHands, sonyLegs);

        print(robot_1);
        print(robot_2);
        print(robot_3);

        int max;
        max = robot_1.getPrice();
        int[] arrPrice = new int[]{robot_1.getPrice(), robot_2.getPrice(), robot_3.getPrice()};
        for(int i = 0; i < arrPrice.length; i++){
            if(max < arrPrice[i]){
                max = arrPrice[i];
            }
        }
        System.out.println("Самый дорогой робот стоит " + max);
    }
}
