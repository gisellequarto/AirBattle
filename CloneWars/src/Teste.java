import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.tailormoons.Bullet;
import org.academiadecodigo.tailormoons.Grid;

public class Teste {

    public static void main(String[] args) throws InterruptedException {
       /* Picture picture1 = new Picture(1, 1, "assests/predio.jpg");

        picture1.draw();*/


        Grid grid1 = new Grid();
        Bullet bullet = new Bullet(200, 500);
        while (true) {
            Thread.sleep(100);
            bullet.move();
        }

    }
}
