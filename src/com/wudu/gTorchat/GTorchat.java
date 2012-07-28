package com.wudu.gTorchat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.Box;

public class GTorchat extends JFrame{
   private static final long serialVersionUID = -1629126333941881514L;

   // Static finals
   public final static int WIDTH = 200;
   public final static int HEIGHT = 400;
   public final static String TITLE = "gTorchat";

   private DefaultListModel listModel;
   
   public GTorchat() {
      
      //create and set menubar
      setJMenuBar(createMenuBar());        
      
      JLabel label = new JLabel(new ImageIcon("icons/online.png"));
      label.setText("WTF?");
      
      listModel = new DefaultListModel();
      
      JList<?> list = new JList<Object>();
      //list.setCellRenderer(new ImageListCellRenderer());
      //list.setBackground(new Color(255,0,0));
      list.setPreferredSize(null);
      list.setModel(listModel);
      
      JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      //scrollPane.setBackground(new Color(255,0,0));
      scrollPane.getViewport().add(list);
      
      setLayout(new BorderLayout());
      add(scrollPane, BorderLayout.CENTER);

            
      //set JFrame properties
      pack();
      setTitle(TITLE);
      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
   }

   private  void ItemAdder () {
      
        int index = listModel.getSize();
        listModel.addElement("Entry " + (index+1));
        getContentPane().invalidate();
        getContentPane().validate();
      
    }
   
   private JMenuBar createMenuBar(){
      //create menu items
      JMenuItem menuItemExit = new JMenuItem("Exit");
      menuItemExit.setActionCommand("Exit");
      menuItemExit.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent arg0) {
            dispose();
            System.exit(0);
            
         }
      });

      //create menus
      JMenu menuFile = new JMenu("File");
      menuFile.add(menuItemExit);

      // Create menubar
      JMenuBar menuBar = new JMenuBar();
      menuBar.add(menuFile);
      return menuBar;
   }

   /**
    * @param args
    */
   public static void main(String[] args) {
      GTorchat gt = new GTorchat();
      
      for(int i = 0 ; i < 100 ; i++)
      gt.ItemAdder();
   }

}
