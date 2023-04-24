/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.esprit.Entities;

import javafx.scene.paint.Color;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.scene.paint.Paint;

public class MyClassIcon {
    private final FontAwesomeIconView deleteIcon = new FontAwesomeIconView(FontAwesomeIcon.TRASH);
    private final FontAwesomeIconView editIcon = new FontAwesomeIconView(FontAwesomeIcon.PENCIL_SQUARE);
    private final FontAwesomeIconView mailIcon = new FontAwesomeIconView(FontAwesomeIcon.ENVELOPE);
    private final FontAwesomeIconView banIcon = new FontAwesomeIconView(FontAwesomeIcon.BAN);
    public MyClassIcon() {
        deleteIcon.setSize("30px");
        deleteIcon.setFill(Color.RED);
        editIcon.setSize("30px");
        editIcon.setFill(Color.GREEN);
        mailIcon.setSize("30px");
        mailIcon.setFill(Color.BLUE);
        banIcon.setSize("30px");
        banIcon.setFill(Color.RED);
    }

    public FontAwesomeIconView getDeleteIcon() {
        return deleteIcon;
    }

    public FontAwesomeIconView getEditIcon() {
        return editIcon;
    }
    
    public FontAwesomeIconView getMailIcon() {
        return mailIcon;
    }
    
     public FontAwesomeIconView getBanIcon() {
        return banIcon;
    }

    public void setDeleteIconSize(String size) {
        deleteIcon.setSize(size);
    }

    public void setEditIconSize(String size) {
        editIcon.setSize(size);
    }
     public void setMailIconSize(String size) {
        mailIcon.setSize(size);
    }

     public void setBanIconSize(String size) {
        banIcon.setSize(size);
    }
     
    public void setDeleteIconFill(Paint fill) {
        deleteIcon.setFill(fill);
    }

    public void setEditIconFill(Paint fill) {
        editIcon.setFill(fill);
    }
    
    public void setMailIconFill(Paint fill) {
        mailIcon.setFill(fill);
    }
    
    public void setBanIconFill(Paint fill) {
        banIcon.setFill(fill);
    }
}

