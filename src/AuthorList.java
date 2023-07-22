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
public class AuthorList extends JPanel {

    public AuthorList() {
        super();
        LayoutManager layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        
        for(data.Author author : data.Author.AUTHORS) {
            AuthorCard pane = new AuthorCard(author);
            add(pane);
        }
    }
    
}
