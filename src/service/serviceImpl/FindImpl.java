package service.serviceImpl;

import model.Cast;
import model.DataBase;
import model.Director;
import model.Movie;
import service.Findable;
import service.Sortable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FindImpl implements Findable {
    Scanner scanner=new Scanner(System.in);
    private DataBase dataBase;
    public FindImpl(DataBase dataBase){
        this.dataBase=dataBase;
    }
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
    public DataBase getDataBase() {
        return dataBase;
    }
    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return dataBase.getMovies();
    }
    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies) {
        System.out.println("Введите полное или неполное название фильма");
        String name=scanner.nextLine();
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if(dataBase.getMovies().get(i).getName().contains(name)){
                System.out.println(dataBase.getMovies().get(i));
            }

        }
    }
    @Override
    public void findMovieByActorName(List<Movie> movies) {
        System.out.println("Введите имя актера, фильмы которого хотите получить");
        String actorName=scanner.nextLine();
        for(int i=0;i<dataBase.getMovies().size();i++){
            for (int j = 0; j < dataBase.getMovies().get(i).getCast().size(); j++) {
                if(dataBase.getMovies().get(i).getCast().get(j).getActorFullName().contains(actorName)){
                    System.out.println(dataBase.getMovies().get(i));
                }
            }

        }
    }
    @Override
    public void findMovieByYear(List<Movie> movies) {
        System.out.println("Введите год для поиска фильмов: ");
        int num= scanner.nextInt();
        for (int i = 0; i <dataBase.getMovies().size() ; i++) {
            if(num==dataBase.getMovies().get(i).getYear()){
                System.out.println(dataBase.getMovies().get(i));
            }
        }
    }
    @Override
    public void findMovieByDirector(List<Movie> movies, Director director) {
        for (int i = 0; i < dataBase.getMovies().size(); i++) {
            if(dataBase.getMovies().get(i).getDirector()==director){
                System.out.println(dataBase.getMovies().get(i));
            }
        }
    }
    @Override
    public void findMovieByGenre(List<Movie> movies) {
        System.out.println("Введите тип жанра, по которому желаете найти фильмы");
        String genre=scanner.nextLine();
        for (int i=0;i<dataBase.getMovies().size();i++){
            if(dataBase.getMovies().get(i).getGenre().contains(genre)){
                System.out.println(dataBase.getMovies().get(i));
            }
        }
    }
    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Введите имя персонажа,по которому желаете найти фильм");
        String role=scanner.nextLine();
        for(int i=0;i<dataBase.getMovies().size();i++){
            for(int j=0;j<dataBase.getMovies().get(i).getCast().size();j++){
                if(dataBase.getMovies().get(i).getCast().get(j).getRole().contains(role)){
                    System.out.println(dataBase.getMovies().get(i));
                }
            }
        }
}
}
