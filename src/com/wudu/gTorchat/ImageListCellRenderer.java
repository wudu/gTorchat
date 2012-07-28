package com.wudu.gTorchat;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;

class ImageListCellRenderer implements ListCellRenderer {

   public Component getListCellRendererComponent(JList jlist, Object value, int cellIndex, boolean isSelected, boolean cellHasFocus) {

      Component component = (Component) value;
      component.setForeground(Color.white);
      component.setBackground(isSelected ? UIManager.getColor("Table.focusCellForeground") : Color.white);
      return component;

   }
}