package class1.ex;

public class MovieReview {
    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public void showReview() {
        System.out.println("영화제목 : " + this.title);
        System.out.println("review : " + this.review);
    }
}
