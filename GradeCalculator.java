import java.util.Scanner;

public class GradeCalculator {

    public GradeCalculator() {

    }

    public void printGrade(int scoreInput){
        //score is 0 to 100, by dividing it to 10 we can handle all score values in just 10 cases
        int result = scoreInput/10;
        switch(result){
            case 0,1,2,3,4,5 -> System.out.println("F");
            case 6 -> System.out.println("D");
            case 7 -> System.out.println("C");
            case 8 -> System.out.println("B");
            case 9,10 -> System.out.println("A");
            default -> System.out.println("Score outside of 0 - 100 range");
        }
    }

    public void calculateGrade(){
        //define input objects for typing answers at runtime
        Scanner input = new Scanner(System.in);
        Scanner repeat = new Scanner(System.in);

        System.out.println("Do you want to grade your score? (Yes/No)");

        //user can type in an answer (Yes/No), case insensitive
        String answer = repeat.nextLine();

        //if the answer is not 'yes' or 'no', then a message is displayed
        if(!(answer.equalsIgnoreCase("yes")) && !(answer.equalsIgnoreCase("no")))
        {
            System.out.println("I see you're not taking things seriously. I'm gonna stop playin'");
        }
        else {

            //while the answer is 'yes'
            while (answer.equalsIgnoreCase("yes")) {
                System.out.println("Type in a score 0 to 100: ");

                //user can type in a score to be graded
                String testScore = input.nextLine();

                //while the score is not a valid integer
                while(!testScore.matches("-?\\d+")){
                    System.out.println("Invalid value! Type a valid integer value or 'break' to close");

                    //ask for new input
                    testScore = input.nextLine();

                    //check if user wants to exit
                    if(testScore.equalsIgnoreCase("break"))
                    {
                        return;
                    }
                }

                //parse the input given by user
                int score = Integer.parseInt(testScore);

                //check for correct range 0 to 100
                if (score >= 0 && score <= 100) {
                    //call method that grades the score using a switch
                    this.printGrade(score);
                } else {
                    System.out.println("The introduced value is outside of bounds");
                }

                //check if user wants to do this for other scores as well
                System.out.println("Type in new score? (Yes/No)");
                answer = repeat.nextLine();

                //check if answer is valid. Only 'yes' or 'no' allowed, case insensitive
                if (!(answer.equalsIgnoreCase("yes")) && !(answer.equalsIgnoreCase("no"))) {
                    System.out.println("""
                            Seriously? I specifically said to type in only \"yes\" or \"no\". 
                            I'm gonna stop playin'""");
                }
            }
        }
    }
}
