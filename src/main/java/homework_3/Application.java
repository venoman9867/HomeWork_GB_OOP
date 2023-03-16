package homework_3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите игру");
        int num = in.nextInt();
        Game game = null;
        switch (num) {
            case 1 -> game = new NumberGame();
            case 2 -> game = new EnglishGame();
            case 3 -> game = new RussianGame();
            default -> System.out.println("такой игры еще не существует");
        }
        assert game != null;
        game.start(4, 40);
        StringBuilder history=new StringBuilder();
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.println("ваш ход");
            String answer = in.next();
            history.append(answer).append(" ");
            Answer answerGame = game.inputAnswer(answer);
            System.out.printf("Найдено %d коров и %d быков%n", answerGame.getCows(), answerGame.getBulls());
        }
        System.out.println("Хотели бы вы посмотреть историю ходов?Да/Нет");
        String str=in.next();
        if(str.hashCode()=="Да".hashCode()){
            System.out.println(history);
        }
        System.out.println(game.getGameStatus());
    }
}
