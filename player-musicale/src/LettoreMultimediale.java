import Obj.Audio;
import Obj.ElementoMultimediale;
import Obj.Immagine;
import Obj.Video;

import java.util.Scanner;

public class LettoreMultimediale {

    public static void main(String[] args) {


        ElementoMultimediale obj1 = new Immagine(3);
        ElementoMultimediale obj2 = new Audio(5, "Canzone 1", 4);
        ElementoMultimediale obj3 = new Audio(3, "Canzone 2", 2);
        ElementoMultimediale obj4 = new Immagine(5);
        ElementoMultimediale obj5 = new Video(10, "Video 1", 3, 2);

        ElementoMultimediale[] array = new ElementoMultimediale[]{obj1, obj2, obj3, obj4, obj5};

        System.out.println("Scegli un'opzione (da 1 a 5): ");

        Scanner scanner = new Scanner(System.in);
        int index = Integer.valueOf(scanner.nextLine());

        if(array[index - 1] instanceof Video || array[index - 1] instanceof Audio) {
            array[index - 1].play();
        }
        else {
            ((Immagine) array[index - 1]).show();
        }

    }

}
