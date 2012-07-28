package com.wudu.gTorchat;

import java.awt.Component;
import java.awt.Image;

import javax.swing.DefaultListCellRenderer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class Contact extends JLabel implements ListCellRenderer{

   public static enum Status {
      online, away, extendedAway, offline
   };

   private static ImageIcon iconOnline = new ImageIcon("icons/online.png");
   
   private String name;
   private String address;
   private String description;
   private Status status;
   
   

   public Contact(String name, String address, String description) {
      this.name = name;
      this.address = address;
      this.description = description;
      status = Status.offline;
   }



   @Override
   public Component getListCellRendererComponent(JList arg0, Object arg1, int arg2, boolean arg3, boolean arg4) {
      // TODO Auto-generated method stub
      return null;
   }

}
