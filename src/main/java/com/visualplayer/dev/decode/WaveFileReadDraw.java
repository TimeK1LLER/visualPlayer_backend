package com.visualplayer.dev.decode;
import com.visualplayer.dev.decode.waveaccess.WaveFileReader;

import javax.swing.JFrame;
public class WaveFileReadDraw {
    /**
     * @param args
     * 这是一个Demo  可以测试用
     */
    public static void main(String[] args) {
        String filename = "file.wav";
        JFrame frame = new JFrame();
        WaveFileReader reader = new WaveFileReader(filename);
        if(reader.isSuccess()){
            int[] data = reader.getData()[0]; //获取第一声道
            DrawPanel drawPanel = new DrawPanel(data); // 创建一个绘制波形的面板
            frame.add(drawPanel);
            frame.setTitle(filename);
            frame.setSize(800, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
        else{
            System.err.println(filename + "不是一个正常的wav文件");
        }
    }
}
