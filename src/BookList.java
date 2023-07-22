/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.LayoutManager;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
 *
 * @author miche
 */
public class BookList extends JPanel {
    public BookList() {
        
    }
    
    public void populate(data.Book[] books) {
        removeAll();
        LayoutManager layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);
        
        for(data.Book author : books) {
            Book pane = new Book(author);
            add(pane);
        }
    }
}
