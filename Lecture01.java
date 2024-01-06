import java.util.*;

class Lecture01 {
    public static void main(String[] args) {
        System.out.println("Hello from lecture 01");

        // SELF-CHECK PROBLEMS:
        // Note: you may need to put some of your answers inside comments
        System.out.println();

        // Put your answer for #1 here:
        // Hello from lecture 01
        // Copy and paste the output from when you first cloned (downloaded) and ran
        // this program
        // (in other words, when you run this program, what does it print?
        // Copy that output into this file, right here, in a comment

        // Where in the textbook are the main topics for this question covered?
        // The main topics for this question are covered in chapter 1.2

        // Put your answer for #2 here:
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        // I chose a for loop because I experimented with the while loop, however, I would need to initialize a variable
        // outside of it to get it started so I decided to keep everything modular within the for loop.
        System.out.println();
        // Where in the textbook are the main topics for this question covered?
        // You can find information on this topic in chapter 2.3

        // Put your answer for #3 here:
        for (int row = 0; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Where in the textbook are the main topics for this question covered?
        // You can find the main topics for this question in chapter 2.3
        System.out.println("How many rows would you like to print?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();


        // Put your answer for #4 here:
        for (int row = 0; row < answer; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }

        // Where in the textbook are the main topics for this question covered?
        // Reading user input is in chapter 3.3 and nested for loops is in chapter 2.3.
        System.out.println();

        // Put your answer for #5 here:
        System.out.println("How many grades would you like to store?");
        int storageSize = input.nextInt();

        double sum = 0;

        for (int i = 0; i < storageSize; i++) {
            System.out.print("Next grade? ");
            double gpa = input.nextDouble();
            sum += gpa;
            System.out.println();
        }
        double average = sum / storageSize;
        System.out.println("The average of your grades is: " + average);


        // Where in the textbook are the main topics for this question covered?
        // Reading user input is in chapter 3.3, cumulative algorithms are in chapter 4.2
        // for loops is from chapter 1.2, and concatenation is from chapter 2.2

        // Put your answer for #6 here:
        Foods pear = new Foods("Pear", 102, 3.1);
        Foods steak = new Foods("Steak", 278, 4.9);
        System.out.println(steak.getName());
        steak.setName("Filet Mignon");
        System.out.println(steak.getName());

        System.out.println();

        pear.print();
        steak.print();


        // Where in the textbook are the main topics for this question covered?
        // Constructors are in chapter 8.3, accessors and mutators are in chapter 8.2
        // NOTE: The definition of the Food class should go OUTSIDE the Lecture01
        // class. A good place to put this is at the end of the file.
        // NOTE 2: Make sure that you create a couple of Food objects here in main()

    }
}

// Placing the Food class below this line is a good place for it
 class Foods {
    private String name;
    private int cal;
    private double rating = -1;

    Scanner input = new Scanner(System.in);
    public Foods(String foodName, int foodCal, double foodRating) {
        this.name = foodName;
        this.cal = foodCal;
        this.setRating(foodRating);
    }

    public String getName() {
        return this.name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0 and 5 inclusive.");
            this.rating = -1;
        }
    }

    public void print() {
        System.out.println("Food: " + name);
        System.out.println("Calories: " + cal);
        System.out.println("Rating: " + rating);
    }
}