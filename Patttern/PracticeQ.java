package Patttern;

public class PracticeQ {
    public static void main(String[] args) {
        // Hollow Rectangle pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if ((i == 2 || i == 3) && (j > 1 && j <= 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("Invertd & Rotated Half-Pyramid");
        // Inverted & Rotated half-Pyramid pattern
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Inverted half-Pyramid with Numbers");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Floyd's Triangle pattern
        System.out.println("Floyd Triangle pattern");
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        
        // 0-1 traingle pattern
        System.out.println("0-1 Traingle pattern");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }

                } else {
                    if (j % 2 == 0) {
                        System.out.print(0 + " ");
                    } else {
                        System.out.print(1 + " ");
                    }
                }
            }
            System.out.println();
        }
        

        // butterfly pattern
        System.out.println("ButterFly pattern");
        for (int i = 1; i <= 8; i++) {
            if (i <= 4) {

                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 8 - i * 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 9 - i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= i * 2 - 10; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 9 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
         System.out.println("solid Rhombus pattern");
        // Solid Rhombus pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
          
        // Hollow Rhombus pattern

        System.out.println("Hollow Rhombus pattern");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            if (i == 1 || i == 5) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 4; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Diamond Problem");
        // Diamond Pattern
        for (int i = 1; i <= 8; i++) {
            if (i <= 4) {
                for (int j = 1; j <= 4 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= i - 5; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 17 - 2 * i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
           System.out.println("Number Pyramid");
        // Number Pyramid pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // palindromic pattern
        System.out.println("palindromic pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }

    }
}
