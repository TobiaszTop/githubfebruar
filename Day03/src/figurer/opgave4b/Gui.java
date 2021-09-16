package figurer.opgave4b;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Gui extends Application
{
    public static void main(String[] args)
    {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Figurer Opgave 4");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent()
    {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------



    private void drawShapes(Pane pane)
    {
        class Cloud{

            public Cloud(int x, int y, int size){
                int radius = size*8;
                int baseHeight = size*13;
                int baseWidth = size*20;
                Rectangle cloudBase = new Rectangle(x, y, baseWidth, baseHeight);
                Circle cloud1 = new Circle(x, y+size*5, radius);
                Circle cloud2 = new Circle(x+size*6, y, radius);
                Circle cloud3 = new Circle(x+size*12, y-size*2, radius);
                Circle cloud4 = new Circle(x+size*18, y+size*5, radius);

                cloudBase.setFill(Color.WHITE);
                cloud1.setFill(Color.WHITE);
                cloud2.setFill(Color.WHITE);
                cloud3.setFill(Color.WHITE);
                cloud4.setFill(Color.WHITE);

                pane.getChildren().add(cloudBase);
                pane.getChildren().add(cloud1);
                pane.getChildren().add(cloud2);
                pane.getChildren().add(cloud3);
                pane.getChildren().add(cloud4);
            }
        }

        Rectangle background1 = new Rectangle(0, 0,400, 350);
        Rectangle background2 = new Rectangle(0, 350,400, 50);
        Line line1 = new Line(25, 350, 375, 350);
        Rectangle rect1 = new Rectangle(50, 230,120, 120);
        Rectangle rect2 = new Rectangle(75, 255,40, 40);
        Polygon poly1 = new Polygon(25, 230, 110, 150, 195, 230);
        Circle circ1 = new Circle(280, 140,50);

        String sky = "#B2FFFF";
        String ground = "#CCCCCC";

        background1.setFill(Paint.valueOf(sky));
        rect1.setFill(Color.RED);
        poly1.setFill(Color.GREEN);
        circ1.setFill(Color.YELLOW);
        circ1.setStroke(Color.BLACK);
        background2.setFill(Paint.valueOf(ground));
        pane.getChildren().add(background1);

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                Cloud cloud1 = new Cloud(i*40+10, j*40+10, 1);
            }
        }

        pane.getChildren().add(circ1);
        pane.getChildren().add(background2);
        pane.getChildren().add(rect1);
        pane.getChildren().add(rect2);
        pane.getChildren().add(line1);
        pane.getChildren().add(poly1);
    }
}
