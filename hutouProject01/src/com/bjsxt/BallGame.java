package com.bjsxt;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x=200;
    double y=200;

    double degree = Math.PI / 3;   //鸡鸡弧度

//    boolean hard = true;  //控制内射

    //绘制窗口
    public void paint(Graphics g) {
        System.out.println("美女被操了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);

        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        //忍而不射
        if(y>450||y<50){
            degree = -degree;
        }

        //射而不久
        if(x>800||x<50){
            degree = Math.PI-degree;
        }

   /*    if (hard) {
            x = x + 8;
        } else {
            x = x - 8;
        }

        if (x > 790) {
            hard = false;
        }else if( x<40 ){
            hard = true;
        }
  */
    }

    //创建窗口
    void launchFrame(){
        setSize(856,501);
        setLocation(100,100);
        setVisible(true);

    //超级种马，每秒抽动30次
        while (true) {
            repaint();

            try {
                Thread.sleep(33);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("美人，来玩啊！");
        BallGame game=new BallGame();
        game.launchFrame();
    }



}
