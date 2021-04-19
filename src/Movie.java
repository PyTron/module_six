import java.lang.reflect.Array;

/*
The movie name
The MPAA rating (e.g. G, PG, PG-13, R)
The number of people that have rated this movie as a 1 (Terrible)
The number of people that have rated this movie as a 2 (Bad)
The number of people that have rated this movie as a 3 (OK)
The number of people that have rated this movie as a 4 (Good)
The number of people that have rated this movie as a 5 (Great)

Write a method addRating that takes an integer as an input parameter. 
The method should verify that the parameter is a number between 1 and 5, 
and if so, increment by one the number of people rating the movie that matches 
the input parameter.
*/
public class Movie {
    private int movieID;
    private String movieName;
    private String maturityRating;
    private int[] ratingArray = {0,0,0,0,0};

    public void setMovie(String a,String b, int c){
        movieName=a;
        maturityRating=b;
        movieID = c;
    }
    public int getMovieID(){
        return movieID;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMaturityRating(){
        return maturityRating;
    }
    public void addRating(int a){
        if (a>0&&a<6){
            a = a - 1;
            ratingArray[a]=ratingArray[a] + 1;
        }
    }
    public double getAverage(){
        double average = 0.0;
        int count=0;
        for(int i=0;i<5;i++){
            average = average + (ratingArray[i] * (i+1));
            if(ratingArray[i]>0)
                count++;
        }
        average = average / count;
        return average;
    }
    public int getTerrible(){
    return ratingArray[0];
    }
    public int getBad(){
        return ratingArray[1];
    }
    public int getOk(){
        return ratingArray[2];
    }
    public int getGood(){
        return ratingArray[3];
    }
    public int getGreat(){
        return ratingArray[4];
    }
}
