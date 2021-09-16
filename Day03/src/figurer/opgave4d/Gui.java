package figurer.opgave4d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.lang.reflect.Array;

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

        stage.setTitle("Oscillating Stars");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent()
    {
        Pane pane = new Pane();
        pane.setPrefSize(1536, 832);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------



    private void drawShapes(Pane pane)
    {

        int s=32, z=0, q=1, o=s/2;
        for(int i=0; i<1536/s; i++){
            for(int j=0; j<832/s; j++){

                int x=i*s, y=j*s;
                int x1, x2, y1, y2;
                String[] c = {"#0e3053", "#d7d9c4"};

                if(i%2==0&&j%2==0){x1=x;y1=y+s;x2=x+s;y2=y+s;}
                else if(i%2==1&&j%2==0){x1=x;y1=y;x2=x;y2=y+s;}
                else if(i%2==0){x1=x+s;y1=y;x2=x+s;y2=y+s;}
                else{x1=x;y1=y;x2=x+s;y2=y;}

                Rectangle rect = new Rectangle(x, y ,s, s);
                Polygon poly = new Polygon(x1, y1, x+o, y+o, x2, y2);

                q=(q+1)%2;
                if(i%2==0&&i>1&&j<2){q=(q+1)%2;}
                if(q%2==1){z=(z+1)%2;}

                rect.setFill(Paint.valueOf(c[z]));
                poly.setFill(Paint.valueOf(c[(z+1)%2]));
                pane.getChildren().add(rect);
                pane.getChildren().add(poly);

            }
        }
    }
}
