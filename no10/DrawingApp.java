package no10;

import javax.swing.JFrame;

public class DrawingApp extends JFrame {

    public DrawingApp() {
    	// ウィンドウの名前
        setTitle("Drawing App");
        
        // ウィンドウを閉じたらプログラムを自動で終了
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // インスタンス生成
        DrawingPanel drawingPanel = new DrawingPanel();
        
        // 描画パネルをJFrameに追加
        // これを書かないとDrawingPanelのプログラムが動かない
        add(drawingPanel);

        //大きさ
        setSize(500,500);
        
        // ウィンドウ表示
        setVisible(true);
    }

}
