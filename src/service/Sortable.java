package service;

import model.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies);
        //-from A to Z
        //
        //-from Z to A
    void sortByYear(List<Movie>movies);
        //-Ascending
        //
        //-Descending
    void sortByDirector(List<Movie>movies);


}
