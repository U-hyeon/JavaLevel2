package class1.ex;

import java.util.ArrayList;
import java.util.List;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview doctorWho;
        MovieReview loveLive;
        doctorWho = new MovieReview("Doctor Who","Best SF Drama ever!!");
        loveLive = new MovieReview("LoveLive!","My Passion, Motivation, and my Life");

        List<MovieReview> reviews = new ArrayList<>();
        reviews.add(doctorWho);
        reviews.add(loveLive);

        for (MovieReview review : reviews){
            review.showReview();
        }
    }
}
