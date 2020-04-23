package sample;
/**
 * @uthor foneom
 * @version 1.0
 *
 */


        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.stage.Stage;

        import java.util.Random;


public class Main extends Application {
    public static int pasLenght=0;
    static char[] LowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] UpperCase = {'A', 'B', 'C', 'D', 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    static char[] symbols = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Password generator");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
    public static String passGen(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z',
                'A', 'B', 'C', 'D', 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '1', '2', '3', '4', '5', '6', '7', '8', '9', '0','!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }

    public static String passGenLower(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }
    public static String passGenUpper(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'A', 'B', 'C', 'D', 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }

    public static String passGenNumbers(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }

    public static String passGenSymbols(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }

    public static String passGenUpperLower(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        char[]arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','p','q','r','s','t','u','v','w','x','y','z',
                'A', 'B', 'C', 'D', 'C', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i=0;i<pasLenght;i++){
            s.append(arr[random.nextInt(arr.length)]);
        }
        return s.toString();
    }

    public static String passGenUpperNumber(){
        StringBuilder s=new StringBuilder();
        Random random=new Random();
        for (int i=0;i<pasLenght;i++){
            s.append(UpperCase[random.nextInt(UpperCase.length)]+numbers[random.nextInt(numbers.length)]);
        }
        return s.toString();
    }
}
