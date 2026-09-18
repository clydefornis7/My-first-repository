public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Spider-Man:Brand New Day";
        movie1.genre = "Action/Adventure";
        movie1.duration = 145;

        Movie movie2 = new Movie();
        movie2.title = "3 Idiots";
        movie2.genre = "Comedy/Romance";
        movie2.duration = 171;

        Movie movie3 = new Movie();
        movie3.title = "Insidious:Out of the Further";
        movie3.genre = "Horror";
        movie3.duration = 106;

        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}
