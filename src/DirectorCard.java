/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */


/**
 *
 * @author Jonathan Touriz
 */
public class DirectorCard extends javax.swing.JPanel {
    data.Director director;
    /**
     * Creates new form Author
     */
    public DirectorCard(data.Director director){
        this.director = director;
        initComponents();
        if(director.smallPicture != null) {
            this.picture.setIcon(director.smallPicture);
        }
        this.name.setText(director.name);
        this.lifespan.setText(director.birth + " - " + director.death);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picture = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lifespan = new javax.swing.JLabel();

        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(200, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picture.setText("jLabel1");
        picture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureMouseClicked(evt);
            }
        });
        add(picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 56, 80));
        picture.getAccessibleContext().setAccessibleName("picture");

        name.setText("Name");
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lifespan.setText("Lifespan");
        add(lifespan, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 48, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureMouseClicked
        Information info = new Information(director);
        info.setVisible(true);
    }//GEN-LAST:event_pictureMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lifespan;
    private javax.swing.JLabel name;
    private javax.swing.JLabel picture;
    // End of variables declaration//GEN-END:variables
}
