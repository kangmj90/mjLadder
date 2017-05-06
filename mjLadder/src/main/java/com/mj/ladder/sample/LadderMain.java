package com.mj.ladder.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LadderMain {
    public static void main(String[] args) {
        Ladder ladder = new Ladder();

        ladder.addLineOfRightDirection(new LadderPoint(1, 1));
        ladder.addLineOfRightDirection(new LadderPoint(6, 1));
        ladder.addLineOfRightDirection(new LadderPoint(9, 1));
        ladder.addLineOfRightDirection(new LadderPoint(3, 2));
        ladder.addLineOfRightDirection(new LadderPoint(5, 2));
        ladder.addLineOfRightDirection(new LadderPoint(8, 2));
        ladder.addLineOfRightDirection(new LadderPoint(4, 3));
        ladder.addLineOfRightDirection(new LadderPoint(7, 3));
        ladder.addLineOfRightDirection(new LadderPoint(10, 3));
        ladder.addLineOfRightDirection(new LadderPoint(2, 4));
        ladder.addLineOfRightDirection(new LadderPoint(6, 4));
        ladder.addLineOfRightDirection(new LadderPoint(8, 4));
        ladder.addLineOfRightDirection(new LadderPoint(3, 5));
        ladder.addLineOfRightDirection(new LadderPoint(5, 5));
        ladder.addLineOfRightDirection(new LadderPoint(7, 5));

        String input = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                input = br.readLine();
                if ("X".equals(input.trim().toUpperCase()))
                    break;

                if (!"".equals(input))
                    System.out.println(ladder.play(Integer.parseInt(input)));
            } catch (IOException e) {
                break;
            }
        } while (true);
    }
}
