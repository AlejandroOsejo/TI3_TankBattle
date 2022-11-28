package com.example.ti3_tankbattle.model;


import com.example.ti3_tankbattle.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import java.util.Random;

public class Avatar {

    private Canvas canvas;
    private GraphicsContext gc;
    public Vector pos;
    public Vector direction;

    private Image tank;
    private Image wall;
    private Random rnd;

    private int ammunition = 10;

    public Avatar(Canvas canvas, double posx, double posy) {
        this.canvas = canvas;
        gc = canvas.getGraphicsContext2D();
        String uri = "file:"+ Application.class.getResource("tank.png").getPath();
        String uri2 = "file:"+ Application.class.getResource("tank1.png").getPath();
        String uriWall = "file:"+ Application.class.getResource("wall.png").getPath();;
        tank = new Image(uri);
        wall = new Image(uriWall);
        pos = new Vector (posx,posy);
        direction = new Vector(2,2);
    }

    public void draw(){

        gc.save();
        //gc.translate(x,y);
        gc.translate(pos.x, pos.y);
        //gc.rotate(45);
        gc.rotate(90+direction.getAngle());
        gc.drawImage(tank,-17.5,-17.5,35,35);
        gc.restore();
    }

    public void drawWall(double x, double y, double w, double h){
        gc.drawImage(wall,x,y,w,h);


    }
    public void setPosition(double x, double y){
        pos.x=(int) x -25;
        pos.y=(int) y -25;
    }
    //new
    public void changeAngle(double a){
        double amp = direction.getAmplitude();
        double angle = direction.getAngle();
        angle += a;

        //x = a coseno de teta & y = a seno de teta
        direction.x = amp*Math.cos(Math.toRadians(angle));
        direction.y = amp*Math.sin(Math.toRadians(angle));
    }

    public void moveForward(){

        pos.x += direction.x;
        pos.y += direction.y;
    }

    public void moveReverse(){
        pos.x -= direction.x;
        pos.y -= direction.y;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

}
