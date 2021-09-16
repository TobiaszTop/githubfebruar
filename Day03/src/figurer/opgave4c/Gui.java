package figurer.opgave4c;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
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

        stage.setTitle("Tessellating Squares");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent()
    {
        Pane pane = new Pane();
        pane.setPrefSize(1280, 768);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------



    private void drawShapes(Pane pane)
    {
       //mode decides color pattern (choose 1, 2, 3)
       int mode = 2;

       //initialize starting values
       int size = 128;
       double offset = size * 0.5;
       double center = size * 0.4;

       //loop through the pane plane
        for(int i=0; i<1280/size; i++){
            for(int j=0; j<768/size; j++){

                //initialize coordinate values
                int x1 = i*2 * size;
                int y1 = j*2 * size;
                int x2 = x1 + size;
                int y2 = y1 + size;

                //initialize color hexadecimal values
                String c1 = "#f15d51";
                String c2 = "#2d9a9f";
                String c3 = "#0e3053";
                String c4 = "#d7d9c4";

                //initialize rectangle objects
                Rectangle rect1 = new Rectangle(x1, y1 ,size, size);
                Rectangle rect2 = new Rectangle(x2, y1 ,size, size);
                Rectangle rect3 = new Rectangle(x1, y2 ,size, size);
                Rectangle rect4 = new Rectangle(x2, y2 ,size, size);

                //initialize triangle objects
                Polygon poly1 = new Polygon(x1, y1+size, x1+offset, y2-center, x1+size, y1+size);
                Polygon poly2 = new Polygon(x2, y1, x2+center, y1+offset, x2, y1+size);
                Polygon poly3 = new Polygon(x1+size, y1+size, x2-center, y2+offset, x1+size, y2+size);
                Polygon poly4 = new Polygon(x2, y2, x2+offset, y2+center, x2+size, y2);

                //decide colors based on mode value
                if(mode == 1){
                    rect1.setFill(Paint.valueOf(c1));
                    rect2.setFill(Paint.valueOf(c2));
                    rect3.setFill(Paint.valueOf(c3));
                    rect4.setFill(Paint.valueOf(c4));
                    poly1.setFill(Paint.valueOf(c4));
                    poly2.setFill(Paint.valueOf(c3));
                    poly3.setFill(Paint.valueOf(c2));
                    poly4.setFill(Paint.valueOf(c1));
                }else if(mode == 2){
                    rect1.setFill(Paint.valueOf(c1));
                    rect2.setFill(Paint.valueOf(c2));
                    rect3.setFill(Paint.valueOf(c3));
                    rect4.setFill(Paint.valueOf(c4));
                    poly1.setFill(Paint.valueOf(c3));
                    poly2.setFill(Paint.valueOf(c1));
                    poly3.setFill(Paint.valueOf(c4));
                    poly4.setFill(Paint.valueOf(c2));
                }else if(mode == 3){
                    rect1.setFill(Paint.valueOf(c3));
                    rect2.setFill(Paint.valueOf(c4));
                    rect3.setFill(Paint.valueOf(c4));
                    rect4.setFill(Paint.valueOf(c3));
                    poly1.setFill(Paint.valueOf(c4));
                    poly2.setFill(Paint.valueOf(c3));
                    poly3.setFill(Paint.valueOf(c3));
                    poly4.setFill(Paint.valueOf(c4));
                }else{
                    rect1.setFill(Color.WHITE);
                    poly1.setFill(Color.WHITE);
                    rect4.setFill(Color.WHITE);
                    poly4.setFill(Color.WHITE);
                }

                //draw objects
                pane.getChildren().add(rect1);
                pane.getChildren().add(rect2);
                pane.getChildren().add(rect3);
                pane.getChildren().add(rect4);
                pane.getChildren().add(poly1);
                pane.getChildren().add(poly2);
                pane.getChildren().add(poly3);
                pane.getChildren().add(poly4);

            }
        }
    }
}
