package com.example.ti3_tankbattle;

import com.example.ti3_tankbattle.model.Avatar;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class GameController {

    private GraphicsContext gc;

    private Avatar avatar;

    private Avatar Wall;

    private Boolean isRuning = true;

    //Estados de las teclas
    boolean Wpressed = false;
    boolean Apressed = false;
    boolean Spressed = false;
    boolean Dpressed = false;

    boolean Uppressed = false;
    boolean Leftpressed = false;
    boolean Downpressed = false;
    boolean Rightpressed = false;
    @FXML
    private Canvas canvas;

    @FXML
    private GridPane matriz;


    @FXML
    private ImageView Image00;

    @FXML
    private ImageView Image10;

    @FXML
    private ImageView Image20;

    @FXML
    private ImageView Image30;

    @FXML
    private ImageView Image40;

    @FXML
    private ImageView Image50;

    @FXML
    private ImageView Image60;

    @FXML
    private ImageView Image70;

    @FXML
    private ImageView Image80;

    @FXML
    private ImageView Image90;

    @FXML
    private ImageView Image100;

    @FXML
    private ImageView Image110;

    @FXML
    private ImageView Image120;

    @FXML
    private ImageView Image130;

    @FXML
    private ImageView Image140;

    @FXML
    private ImageView Image150;

    @FXML
    private ImageView Image151;

    @FXML
    private ImageView Image141;

    @FXML
    private ImageView Image131;

    @FXML
    private ImageView Image121;

    @FXML
    private ImageView Image111;

    @FXML
    private ImageView Image101;

    @FXML
    private ImageView Image91;

    @FXML
    private ImageView Image81;

    @FXML
    private ImageView Image71;

    @FXML
    private ImageView Image61;

    @FXML
    private ImageView Image51;

    @FXML
    private ImageView Image41;

    @FXML
    private ImageView Image31;

    @FXML
    private ImageView Image21;

    @FXML
    private ImageView Image11;

    @FXML
    private ImageView Image01;

    @FXML
    private ImageView Image152;

    @FXML
    private ImageView Image142;

    @FXML
    private ImageView Image132;

    @FXML
    private ImageView Image122;

    @FXML
    private ImageView Image112;

    @FXML
    private ImageView Image102;

    @FXML
    private ImageView Image92;

    @FXML
    private ImageView Image82;

    @FXML
    private ImageView Image72;

    @FXML
    private ImageView Image62;

    @FXML
    private ImageView Image52;

    @FXML
    private ImageView Image42;

    @FXML
    private ImageView Image32;

    @FXML
    private ImageView Image22;

    @FXML
    private ImageView Image12;

    @FXML
    private ImageView Image02;

    @FXML
    private ImageView Image153;

    @FXML
    private ImageView Image143;

    @FXML
    private ImageView Image133;

    @FXML
    private ImageView Image123;

    @FXML
    private ImageView Image113;

    @FXML
    private ImageView Image103;

    @FXML
    private ImageView Image93;

    @FXML
    private ImageView Image83;

    @FXML
    private ImageView Image73;

    @FXML
    private ImageView Image63;

    @FXML
    private ImageView Image53;

    @FXML
    private ImageView Image43;

    @FXML
    private ImageView Image33;

    @FXML
    private ImageView Image23;

    @FXML
    private ImageView Image13;

    @FXML
    private ImageView Image03;

    @FXML
    private ImageView Image154;

    @FXML
    private ImageView Image144;

    @FXML
    private ImageView Image134;

    @FXML
    private ImageView Image124;

    @FXML
    private ImageView Image114;

    @FXML
    private ImageView Image104;

    @FXML
    private ImageView Image94;

    @FXML
    private ImageView Image84;

    @FXML
    private ImageView Image74;

    @FXML
    private ImageView Image64;

    @FXML
    private ImageView Image54;

    @FXML
    private ImageView Image44;

    @FXML
    private ImageView Image34;

    @FXML
    private ImageView Image24;

    @FXML
    private ImageView Image14;

    @FXML
    private ImageView Image04;

    @FXML
    private ImageView Image155;

    @FXML
    private ImageView Image145;

    @FXML
    private ImageView Image135;

    @FXML
    private ImageView Image125;

    @FXML
    private ImageView Image115;

    @FXML
    private ImageView Image105;

    @FXML
    private ImageView Image95;

    @FXML
    private ImageView Image85;

    @FXML
    private ImageView Image75;

    @FXML
    private ImageView Image65;

    @FXML
    private ImageView Image55;

    @FXML
    private ImageView Image45;

    @FXML
    private ImageView Image35;

    @FXML
    private ImageView Image25;

    @FXML
    private ImageView Image15;

    @FXML
    private ImageView Image05;

    @FXML
    private ImageView Image06;

    @FXML
    private ImageView Image16;

    @FXML
    private ImageView Image26;

    @FXML
    private ImageView Image36;

    @FXML
    private ImageView Image46;

    @FXML
    private ImageView Image56;

    @FXML
    private ImageView Image66;

    @FXML
    private ImageView Image76;

    @FXML
    private ImageView Image86;

    @FXML
    private ImageView Image96;

    @FXML
    private ImageView Image106;

    @FXML
    private ImageView Image116;

    @FXML
    private ImageView Image126;

    @FXML
    private ImageView Image136;

    @FXML
    private ImageView Image146;

    @FXML
    private ImageView Image156;

    @FXML
    private ImageView Image07;

    @FXML
    private ImageView Image17;

    @FXML
    private ImageView Image27;

    @FXML
    private ImageView Image37;

    @FXML
    private ImageView Image47;

    @FXML
    private ImageView Image57;

    @FXML
    private ImageView Image67;

    @FXML
    private ImageView Image77;

    @FXML
    private ImageView Image87;

    @FXML
    private ImageView Image97;

    @FXML
    private ImageView Image107;

    @FXML
    private ImageView Image117;

    @FXML
    private ImageView Image127;

    @FXML
    private ImageView Image137;

    @FXML
    private ImageView Image147;

    @FXML
    private ImageView Image157;

    @FXML
    private ImageView Image08;

    @FXML
    private ImageView Image18;

    @FXML
    private ImageView Image28;

    @FXML
    private ImageView Image38;

    @FXML
    private ImageView Image48;

    @FXML
    private ImageView Image58;

    @FXML
    private ImageView Image68;

    @FXML
    private ImageView Image78;

    @FXML
    private ImageView Image88;

    @FXML
    private ImageView Image98;

    @FXML
    private ImageView Image108;

    @FXML
    private ImageView Image118;

    @FXML
    private ImageView Image128;

    @FXML
    private ImageView Image138;

    @FXML
    private ImageView Image148;

    @FXML
    private ImageView Image158;

    @FXML
    private ImageView Image09;

    @FXML
    private ImageView Image19;

    @FXML
    private ImageView Image29;

    @FXML
    private ImageView Image39;

    @FXML
    private ImageView Image49;

    @FXML
    private ImageView Image59;

    @FXML
    private ImageView Image69;

    @FXML
    private ImageView Image79;

    @FXML
    private ImageView Image89;

    @FXML
    private ImageView Image99;

    @FXML
    private ImageView Image109;

    @FXML
    private ImageView Image119;

    @FXML
    private ImageView Image129;

    @FXML
    private ImageView Image139;

    @FXML
    private ImageView Image149;

    @FXML
    private ImageView Image159;


    @FXML
    private Label P1TF;

    @FXML
    private Label P2TF;

    @FXML
    private Label P3TF;


    public void initialize() {
        String uriW = "file:" + GameController.class.getResource("wall.png").getPath();
        Image wall = new Image(uriW);


        gc = canvas.getGraphicsContext2D();
        canvas.setFocusTraversable(true);

        canvas.setOnMouseClicked(this::onMouseClicked);

        canvas.setOnKeyPressed(this::inKeyPressed);

        canvas.setOnKeyReleased(this::onKeyReleased);
        avatar = new Avatar(canvas); // se crea el avatar
        Wall = new Avatar(canvas);
        draw();

    }


    private void onKeyReleased(KeyEvent keyEvent) {

        if (keyEvent.getCode() == KeyCode.W) {
            Wpressed = false;
        }
        if (keyEvent.getCode() == KeyCode.A) {
            Apressed = false;
        }
        if (keyEvent.getCode() == KeyCode.S) {
            Spressed = false;
        }
        if (keyEvent.getCode() == KeyCode.D) {
            Dpressed = false;
        }
        if (keyEvent.getCode() == KeyCode.UP) {
            Uppressed = false;
        }
        if (keyEvent.getCode() == KeyCode.LEFT) {
            Leftpressed = false;
        }
        if (keyEvent.getCode() == KeyCode.DOWN) {
            Downpressed = false;
        }
        if (keyEvent.getCode() == KeyCode.RIGHT) {
            Rightpressed = false;
        }

    }

    private void inKeyPressed(KeyEvent keyEvent) {

        if (keyEvent.getCode() == KeyCode.W) {
            Wpressed = true;
        }
        if (keyEvent.getCode() == KeyCode.A) {
            Apressed = true;
        }
        if (keyEvent.getCode() == KeyCode.S) {
            Spressed = true;
        }
        if (keyEvent.getCode() == KeyCode.D) {
            Dpressed = true;
        }

        if (keyEvent.getCode() == KeyCode.UP) {
            Uppressed = true;
        }
        if (keyEvent.getCode() == KeyCode.LEFT) {
            Leftpressed = true;
        }
        if (keyEvent.getCode() == KeyCode.DOWN) {
            Downpressed = true;
        }
        if (keyEvent.getCode() == KeyCode.RIGHT) {
            Rightpressed = true;
        }
    }

    public void onMouseClicked(MouseEvent mouseEvent) {
        avatar.setPosition(mouseEvent.getX(), mouseEvent.getY());
    }

    public void draw() {
        new Thread(
                () -> {
                    while (isRuning) {
                        //Dibujo
                        Platform.runLater(
                                () -> {
                                    gc.setFill(Color.BLACK);
                                    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
                                    avatar.draw();
                                    avatar.draw1();

                                    //paredes
                                    // 2.1 2.2 2.3 2.6 2.7 2.8
                                    // 4.4 4.5
                                    // 6.2 6.3 6.4 6.5 6.6 6.7
                                    // 7.4 7.5
                                    // 8.4 8.5
                                    // 9.2 9.3 9.4 9.5 9.6 9.7
                                    // 11.4 11.5
                                    // 13.1 13.2 13.3 13.6 13.7 13.8
                                    //Wall.drawWall(Image21.getLayoutX(),Image21.getLayoutY(), Image21.getFitWidth(),Image21.getFitHeight());
                                    Wall.drawWall(Image22.getLayoutX(),Image22.getLayoutY(), Image22.getFitWidth(),Image22.getFitHeight());
                                    Wall.drawWall(Image23.getLayoutX(),Image23.getLayoutY(), Image23.getFitWidth(),Image23.getFitHeight());
                                    Wall.drawWall(Image26.getLayoutX(),Image26.getLayoutY(), Image26.getFitWidth(),Image26.getFitHeight());
                                    Wall.drawWall(Image27.getLayoutX(),Image27.getLayoutY(), Image27.getFitWidth(),Image27.getFitHeight());
                                    //Wall.drawWall(Image28.getLayoutX(),Image28.getLayoutY(), Image28.getFitWidth(),Image28.getFitHeight());

                                    Wall.drawWall(Image52.getLayoutX(),Image52.getLayoutY(), Image52.getFitWidth(),Image52.getFitHeight());
                                    Wall.drawWall(Image53.getLayoutX(),Image53.getLayoutY(), Image53.getFitWidth(),Image53.getFitHeight());
                                    Wall.drawWall(Image54.getLayoutX(),Image54.getLayoutY(), Image54.getFitWidth(),Image54.getFitHeight());
                                    Wall.drawWall(Image55.getLayoutX(),Image55.getLayoutY(), Image55.getFitWidth(),Image55.getFitHeight());
                                    Wall.drawWall(Image56.getLayoutX(),Image56.getLayoutY(), Image56.getFitWidth(),Image56.getFitHeight());
                                    Wall.drawWall(Image57.getLayoutX(),Image57.getLayoutY(), Image57.getFitWidth(),Image57.getFitHeight());

                                    Wall.drawWall(Image64.getLayoutX(),Image64.getLayoutY(), Image64.getFitWidth(),Image64.getFitHeight());
                                    Wall.drawWall(Image65.getLayoutX(),Image65.getLayoutY(), Image65.getFitWidth(),Image65.getFitHeight());

                                    Wall.drawWall(Image74.getLayoutX(),Image74.getLayoutY(), Image74.getFitWidth(),Image74.getFitHeight());
                                    Wall.drawWall(Image75.getLayoutX(),Image75.getLayoutY(), Image75.getFitWidth(),Image75.getFitHeight());

                                    Wall.drawWall(Image84.getLayoutX(),Image84.getLayoutY(), Image84.getFitWidth(),Image84.getFitHeight());
                                    Wall.drawWall(Image85.getLayoutX(),Image85.getLayoutY(), Image85.getFitWidth(),Image85.getFitHeight());

                                    Wall.drawWall(Image94.getLayoutX(),Image94.getLayoutY(), Image94.getFitWidth(),Image94.getFitHeight());
                                    Wall.drawWall(Image95.getLayoutX(),Image95.getLayoutY(), Image95.getFitWidth(),Image95.getFitHeight());

                                    Wall.drawWall(Image102.getLayoutX(),Image102.getLayoutY(), Image102.getFitWidth(),Image102.getFitHeight());
                                    Wall.drawWall(Image103.getLayoutX(),Image103.getLayoutY(), Image103.getFitWidth(),Image103.getFitHeight());
                                    Wall.drawWall(Image104.getLayoutX(),Image104.getLayoutY(), Image104.getFitWidth(),Image104.getFitHeight());
                                    Wall.drawWall(Image105.getLayoutX(),Image105.getLayoutY(), Image105.getFitWidth(),Image105.getFitHeight());
                                    Wall.drawWall(Image106.getLayoutX(),Image106.getLayoutY(), Image106.getFitWidth(),Image106.getFitHeight());
                                    Wall.drawWall(Image107.getLayoutX(),Image107.getLayoutY(), Image107.getFitWidth(),Image107.getFitHeight());

                                    Wall.drawWall(Image132.getLayoutX(),Image132.getLayoutY(), Image132.getFitWidth(),Image132.getFitHeight());
                                    Wall.drawWall(Image133.getLayoutX(),Image133.getLayoutY(), Image133.getFitWidth(),Image133.getFitHeight());
                                    Wall.drawWall(Image136.getLayoutX(),Image136.getLayoutY(), Image136.getFitWidth(),Image136.getFitHeight());
                                    Wall.drawWall(Image137.getLayoutX(),Image137.getLayoutY(), Image137.getFitWidth(),Image137.getFitHeight());

                                    if (Wpressed) {

                                        //avatar.moveVertical(-3);
                                        avatar.moveForward();
                                    }
                                    if (Apressed) {
                                        //avatar.moveHorizontal(-3);
                                        avatar.changeAngle(-10);
                                    }
                                    if (Spressed) {
                                        //avatar.moveVertical(3);
                                        avatar.moveReverse();
                                    }
                                    if (Dpressed) {
                                        //avatar.moveHorizontal(3);
                                        avatar.changeAngle(10);
                                    }
                                    if (Uppressed) {
                                        //avatar.moveVertical(-3);
                                        avatar.moveForward2();
                                    }
                                    if (Leftpressed) {
                                        //avatar.moveHorizontal(-3);
                                        avatar.changeAngle2(-10);
                                    }
                                    if (Downpressed) {
                                        //avatar.moveVertical(3);
                                        avatar.moveReverse2();
                                    }
                                    if (Rightpressed) {
                                        //avatar.moveHorizontal(3);
                                        avatar.changeAngle2(10);
                                    }
                                });
                        //sleep
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        ).start(); //Se debe poner el start para que lo que esté en draw funcione
    }
}
