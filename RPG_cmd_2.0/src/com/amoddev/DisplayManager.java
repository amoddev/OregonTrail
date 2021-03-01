package com.amoddev;

public class DisplayManager {
    //BLOCKS
    private final char LOFB = '\u2582';
    private final char LHB = '\u2584';
    private final char LTFB = '\u2586';
    private final char FB = '\u2588';
    private final char LR = '\u2590';
    private final char LL = '\u258C';
    private final char SP = ' ';


    //SHADING
    private final char LS = '\u2591';
    private final char MS = '\u2592';
    private final char DS = '\u2593';

    //CURVES
    private final char LC = '\u2599';
    private final char TC = '\u259B';
    private final char RTC = '\u259C';
    private final char RLC = '\u259F';

    private int [][] Intro = {
            // 0 = blank
            // 1 = 1/4 block
            // 2 = 1/2 block
            // 3 = 3/4 block
            // 4 = full block


            //30 by 12
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},// row 1
            {5, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 0, 0, 4, 0, 0, 0, 0, 6, 32},// row 2
            {5, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 0, 0, 4, 0, 0, 0, 4, 0, 4, 0, 4, 4, 0, 4, 0, 0, 0, 0, 6, 0},// row 3
            {5, 0, 4, 0, 4, 0, 4, 4, 0, 0, 4, 4, 0, 0, 4, 0, 0, 0, 4, 0, 4, 0, 4, 0, 4, 4, 0, 0, 0, 0, 6, 0},// row 4
            {5, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 0, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 0, 0, 4, 0, 0, 0, 0, 6, 0},// row 5
            {5, 0, 4, 4, 4, 0, 4, 0, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 0, 0, 4, 0, 0, 0, 0, 6, 0},// row 6
            {5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0},// row 7
            {5, 0, 0, 0, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0},// row 8
            {5, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 4, 0, 4, 0, 4, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0},// row 9
            {5, 0, 0, 0, 0, 0, 4, 0, 0, 4, 4, 0, 0, 4, 4, 4, 0, 0, 4, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0},// row 10
            {5, 0, 0, 0, 0, 0, 4, 0, 0, 4, 0, 4, 0, 4, 0, 4, 0, 4, 4, 4, 0, 4, 4, 4, 0, 0, 0, 0, 0, 0, 6, 0},// row 11
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},// row 12

    };
    private int [][] Start = {
            // 0 = blank
            // 1 = 1/4 block
            // 2 = 1/2 block
            // 3 = 3/4 block
            // 4 = full block


            //30 by 12
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32},// row 1
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 33},// row 2
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 3
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 4
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 5
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 6
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 7
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 8
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 11
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},// row 12

    };

    public void clear(int times) {
        for(int i= 0; i != times; i++){
            System.out.println();
        }
    }

    public void Switcher(int Scene) {
        if (Scene == 1) {

            for (int[] ints : Intro) {

                for (int j = 0; j < ints.length; ++j) {
                    int update = 0;
                    if (ints[j] == 6) {
                        System.out.print(LR);

                    }
                    if (ints[j] == 5) {
                        System.out.print(LL);

                    } else if (ints[j] == 4) {
                        System.out.print(FB);

                    } else if (ints[j] == 3) {
                        System.out.print(LTFB);

                    } else if (ints[j] == 2) {
                        System.out.print(LHB);

                    } else if (ints[j] == 1) {
                        System.out.print(LOFB);

                    } else {
                        System.out.print(SP);

                    }
                    if (ints[j] >= 32) {
                        update = ints[j] - 31;
                    }
                    if (update == 1) {
                        System.out.print("Adapted for command line by AModdev");
                    }


                    if (j == 31) {
                        System.out.println();
                    }
                }
            }

        }

        if (Scene == 2) {

            for (int[] ints : Start) {

                for (int j = 0; j < ints.length; ++j) {
                    int update = 0;
                    if (ints[j] == 6) {
                        System.out.print(LR);

                    }
                    if (ints[j] == 5) {
                        System.out.print(LL);

                    } else if (ints[j] == 4) {
                        System.out.print(FB);

                    } else if (ints[j] == 3) {
                        System.out.print(LTFB);

                    } else if (ints[j] == 2) {
                        System.out.print(LHB);

                    } else if (ints[j] == 1) {
                        System.out.print(LOFB);

                    } else {
                        System.out.print(SP);

                    }
                    if (ints[j] >= 32) {
                        update = ints[j] - 31;
                    }
                    if (update == 1) {
                        System.out.print("You Start your journey in Independence Missouri, what month will you start off on?");
                    }
                    if (update == 2) {
                        System.out.print("| 1. March  | 2. April | 3. May | 4. June | 5. July |");
                    }


                    if (j == 31) {
                        System.out.println();
                    }
                }
            }

        }
    }
}

