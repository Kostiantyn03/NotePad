package com.LTP;
import javax.swing.*;

public class Scroll extends JScrollPane {

          private final boolean isOpened;

          private final String path;

         private final JTextArea text;

    public Scroll(JTextArea text,  boolean isOpened, String path){
        super(text);
          this.text = text;
          this.isOpened = isOpened;
          this.path = path;
    }

           public String getText(){
              return text.getText();
           }

           public boolean isOpened(){
               return isOpened;
           }

           public String getPath(){
               return path;
           }


}


