/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jonathan Touriz
 */
public class DirectorList extends JPanel {

    public DirectorList() {
        super();
        LayoutManager layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        
        for(data.Director director : data.Director.DIRECTORS) {
            DirectorCard pane = new DirectorCard(director);
            add(pane);
        }
    }
    
}
