package service.serviceImpl;

import model.DataBase;
import model.Movie;
import service.Sortable;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortImpl implements Sortable {
    Scanner scanner=new Scanner(System.in);
    int num;
    private DataBase dataBase;
    public SortImpl(){

    }
    public SortImpl(DataBase dataBase){
        this.dataBase=dataBase;
    }
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public DataBase getDataBase() {
        return dataBase;
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        System.out.println("""
                Choose the way you want to sort
                1-to sort from A to Z
                2-to sort from Z to A""");
        switch (num=scanner.nextInt()){
            case 1:
                System.err.println("Sort from A to Z");
                movies.sort(byMovieName);
                for (int i = 0; i < dataBase.getMovies().size(); i++) {
                    System.out.println(dataBase.getMovies().get(i).getName());
                    System.out.println(dataBase.getMovies().get(i));
                }
                break;
            case 2:
                System.err.println("Sort from Z to A");
                movies.sort(byMovieName1);
                for (int i = 0; i < dataBase.getMovies().size(); i++) {
                    System.out.println(dataBase.getMovies().get(i).getName());
                    System.out.println(dataBase.getMovies().get(i));
                }
                break;
        }
    }

    @Override
    public void sortByYear(List<Movie> movies) {
        System.out.println("""
                Choose the way you want to sort
                1-Ascending
                2-Descending""");
        switch(num= scanner.nextInt()){
            case 1:
                System.err.println("Сортировка по возрастанию");
                movies.sort(byMovieYear);
                for (int i = 0; i < dataBase.getMovies().size(); i++) {
                    System.out.println(dataBase.getMovies().get(i).getYear());
                    System.out.println(dataBase.getMovies().get(i));
                }
                break;
            case 2:
                System.err.println("Сортировка по убыванию");
                movies.sort(byMovieYear1);
                for(int i=0;i<dataBase.getMovies().size();i++){
                    System.out.println(dataBase.getMovies().get(i).getYear());
                    System.out.println(dataBase.getMovies().get(i));
                }
                break;
        }
    }
    @Override
    public void sortByDirector(List<Movie> movies) {
        System.err.println("Сортировка по имени режиссера ");
        movies.sort(byDirector);
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            System.out.println(dataBase.getMovies().get(i).getDirector());
            System.out.println(dataBase.getMovies().get(i));
        }
    }
    public Comparator<Movie>byMovieName=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public Comparator<Movie>byMovieName1=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };

    public Comparator<Movie>byMovieYear=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getYear()- o2.getYear();
        }
    };
    public Comparator<Movie>byMovieYear1=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getYear()-o1.getYear();
        }
    };

    public Comparator<Movie>byDirector=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.getDirector().getName().compareTo(o2.getDirector().getName());
        }
    };
}
