
public class Pattern {

    //? static is a key word which loads at the time of loding of class
    //?  static rhing binds with class not with object
    static void p1() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p2() {
        int n = 5;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                if (col <= n - row - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p3() {
        int n = 5;
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col <= 5; col++) {
                if (col <= n - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p4() {
        int n = 5;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                if (col <= row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void p5() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p6() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col || col == n - row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p7() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col <= row) {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }

    static void p9() {
        int n = 5;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                if (col <= n - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void p10() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 3 || row == n || (row == 2 && col == 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void p11() {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == n || row == n/2 +1 || (col == 1 && row <= n/2 +1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p1();
        System.out.println();
        p2();
        System.out.println();
        p3();
        System.out.println();
        p4();
        System.out.println();
        p5();
        System.out.println();
        p6();
        System.out.println();
        p7();
        System.out.println();
        p9();
        System.out.println();
        p10();
        System.out.println();
        p11();
        System.out.println();
    }
}
