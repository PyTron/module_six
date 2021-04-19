import java.util.Scanner;
public class MovieTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Boolean addMovie;
        Boolean addRating;
        Movie movie[] = new Movie[10];
        int assignID=0;
        System.out.println("Would you like to add a movie? Enter (y) for yes or (n) for no");
            if (input.next().charAt(0)=='y')
            addMovie=true;
            else
            addMovie=false;
        while(addMovie){
        System.out.println("Enter a Movie Name");
        String a = input.next();
        System.out.println("Enter a Maturity Rating");
        String b = input.next();
        movie[assignID] = new Movie();
        movie[assignID].setMovie(a, b, assignID);
        assignID++;
        if(assignID == movie.length){
            Movie tempArray[] = new Movie[movie.length*2];
            for(int i=0;i<movie.length;i++){
                tempArray[i]= movie[i];
            }
            movie = tempArray;
        }
        System.out.println("Would you like to add another movie? Enter (y) for yes or (n) for no");
        if (input.next().charAt(0)=='y')
        addMovie=true;
        else
        addMovie=false;    
        }
        System.out.println("Would you like to add a rating? Enter (y) for yes or (n) for no");
        if (input.next().charAt(0)=='y')
        addRating=true;
        else
        addRating=false;
        while(addRating){
            System.out.println("Enter a Movie ID");
            int a = input.nextInt();
            System.out.println("You Have Selected the Movie");
            System.out.println(movie[a].getMovieName());
            System.out.println(movie[a].getMaturityRating());
            System.out.print("Enter a rating to add for this movie...");
            movie[a].addRating(input.nextInt());
            System.out.println("The Terrible rating is now " + movie[a].getTerrible());
            System.out.println("The BAD rating is now " + movie[a].getBad());
            System.out.println("The OK rating is now " + movie[a].getOk());
            System.out.println("The Good rating is now " + movie[a].getGood());
            System.out.println("The Great rating is now " + movie[a].getGreat());
            System.out.println("The average rating is now " + movie[a].getAverage());
            System.out.println("Would you like to add another rating? Enter (y) for yes or (n) for no");
            if (input.next().charAt(0)=='y')
            addRating=true;
            else
            addRating=false;
        }
    }
}
