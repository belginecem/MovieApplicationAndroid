package android.example.moviesapplication;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}