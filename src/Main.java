import model.Cast;
import model.DataBase;
import model.Director;
import model.Movie;
import service.serviceImpl.FindImpl;
import service.serviceImpl.SortImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num;
        Cast cast1=new Cast("Шахрух Хан","Рахул");
        Cast cast2=new Cast("Мадхури Дикшит","Пуджа");
        Cast cast3=new Cast("Неслихан Атагюль","Нихан");
        Cast cast4=new Cast("Бурак Озчивит","Кемаль");
        Cast cast5=new Cast("Ханде Эрчель","Эда");
        Cast cast6=new Cast("Керем Бурсин","Серкан");
        Cast cast7=new Cast("Зеррин Текиндор","Лейла");
        Cast cast8=new Cast("Кейт Уинслетт","Роза");
        Cast cast9=new Cast("Леонардо Ди Каприо","Джек");
        Cast cast10=new Cast("Джонни Депп","Джек воробей");
        Cast cast11=new Cast("Кира Найтли","Элизабет");
        Cast cast12=new Cast("Крис Эванс","Капитан Америка");
        Cast cast13=new Cast("Роберт Дауни младший","Тони Старк");
        Cast cast14=new Cast("Наоми Скотт","Принцесса Жасмин");
        Cast cast15=new Cast("Уилл Смит","Алладин");
        List<Cast>casts1=new ArrayList<>(List.of(cast1,cast2));
        List<Cast>casts2=new ArrayList<>(List.of(cast3,cast4,cast7));
        List<Cast>casts3=new ArrayList<>(List.of(cast5,cast6,cast7));
        List<Cast>casts4=new ArrayList<>(List.of(cast8,cast9));
        List<Cast>casts5=new ArrayList<>(List.of(cast10,cast11));
        List<Cast>casts6=new ArrayList<>(List.of(cast12,cast13));
        List<Cast>casts7=new ArrayList<>(List.of(cast14,cast15));

        List<Cast>casts=new ArrayList<>(List.of(cast1,cast2,cast3,cast4,cast5,cast6,
                cast7,cast8,cast9,cast10,cast11,cast12,cast13,cast14,cast15));

        Director director1=new Director("Яш","Чопра");
        Director director2=new Director("Хилал","Сарал");
        Director director3=new Director("Айтекин","Аташ");
        Director director4=new Director("Джеймс","Кэмерон");
        Director director5=new Director("Роб","Маршалл");
        Director director6=new Director("Энтони","Руссо");
        Director director7=new Director("Гай","Ричи");

        List<Director>directors=new ArrayList<>(List.of(director1,director2,director3,
                director4,director5,director6,director7));

        Movie movie1=new Movie("Сумасшедшее сердце",1997,"Romantic",director1,casts1);
        Movie movie2=new Movie("Черная любовь",2015,"Romantic",director2,casts2);
        Movie movie3=new Movie("Постучись в мою дверь",2020,"Drama/Romantic",director3,casts3);
        Movie movie4=new Movie("Титаник",1997,"Drama",director4,casts4);
        Movie movie5=new Movie("Пираты карибского моря",2007,"Adventure/Fantasy",director5,casts5);
        Movie movie6=new Movie("Мстители",2012,"Adventure/Fantasy",director6,casts6);
        Movie movie7=new Movie("Алладин",2019,"Musical/Fantasy",director7,casts7);

        List<Movie>movies=new ArrayList<>(List.of(movie1,movie2,movie3,movie4,movie5,movie6,movie7));


        DataBase dataBase=new DataBase(movies,casts,directors);
        FindImpl findImpl=new FindImpl(dataBase);
        SortImpl sortImpl=new SortImpl(dataBase);
        while(true){
        System.out.println("""
                        
                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Choose  operation~~~~~~~~~~~~~~~~~~~~~~~~
                        | 1-get all movies                     ||    6-find movie by genre     |
                        | 2-find movie by fullName or partName ||    7-find movie by role      |
                        | 3-find movie by actor name           ||    8-sort movie by name      |
                        | 4-find movie by year                 ||    9-sort movie by year      |
                        | 5-find movie by director             ||    10-sort movie by director |
                        """);
            switch (num= scanner.nextInt()){
                case 1-> System.out.println(findImpl.getAllMovies(movies));//done
                case 2-> findImpl.findMovieByFullNameOrPartName(movies);//done
                case 3-> findImpl.findMovieByActorName(movies);
                case 4-> findImpl.findMovieByYear(movies);//done
                case 5-> findImpl.findMovieByDirector(movies,director1);//done
                case 6-> findImpl.findMovieByGenre(movies);//done
                case 7-> findImpl.findMovieByRole(movies);
                case 8-> sortImpl.sortByMovieName(movies);//done
                case 9-> sortImpl.sortByYear(movies);//done
                case 10-> sortImpl.sortByDirector(movies);//done
                default-> System.out.println("Введите числа только от 1-10");

            }
        }



    }
}