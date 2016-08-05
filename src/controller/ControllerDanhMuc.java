/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Song;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import model.ModelDanhMuc;


/**
 *
 * @author LINNGUYEN
 */
public class ControllerDanhMuc extends AbstractTableModel{
    private ArrayList<Song> alBaiHat=new ArrayList<>();
    private String arCol[]={"Id bài hát","Tên bài hát","Tác giả","Lượt nghe","Xếp hạng"};
    private JTable table;
    private ModelDanhMuc model;
    public ControllerDanhMuc(JTable table){
        model=new ModelDanhMuc();
        this.table=table;
        alBaiHat=model.getList();
    }

    @Override
    public int getRowCount() {
      return alBaiHat.size();
    }

    @Override
    public int getColumnCount() {
        return  arCol.length;
    }

    @Override
    public String getColumnName(int column) {
       return  arCol[column];
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Song objSong =alBaiHat.get(rowIndex);
        Object result = null;
        switch(columnIndex){
            case 0:  result=objSong.getId();
                break;
            case 1:  result=objSong.getTenBaiHat();
                break;
            case 2:  result=objSong.getTacGia();
                break;
            case 3:  result=objSong.getLuotNghe();
                break;
            case 4:  result=objSong.getXepHang();
                break;
        }
        return result;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
          if (columnIndex == 0) {
            return Integer.class;
          }
          return  super.getColumnClass(columnIndex);
    }
    public void loadTable(){
        table.setModel(this);
        
        table.getTableHeader().setPreferredSize(new Dimension(0, 30));
        table.getTableHeader().setFont(new Font("Tahoma",Font.BOLD, 16));
        table.setRowHeight(26);
        table.setFont(new Font("Tahoma",Font.BOLD, 14));
        
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(100);
        table.getColumnModel().getColumn(3).setPreferredWidth(80);
        table.getColumnModel().getColumn(4).setPreferredWidth(80);
    }
    public int addItem(Song song){
        //thêm vào DB
        int id=model.addSong(song);
        song.setId(id);
        //thêm vào model
        alBaiHat.add(song);
        this.fireTableDataChanged();
        //cuộn đến cuối dòng
        table.scrollRectToVisible(table.getCellRect(this.getRowCount()-1, 0, true));
        return id;
    }
    public int editItem(Song song,int row){
        //sua DB
        int id=model.editSong(song);
        //sua model
        int rowModel=table.convertRowIndexToModel(row);
        alBaiHat.set(rowModel, song);
        this.fireTableDataChanged();
        return id;
    }
    public int delItem(int id,int row){
        //del DB
        int result=model.delSong(id);
        //del Model
        int rowModel=table.convertRowIndexToModel(row);
        alBaiHat.remove(rowModel);
        this.fireTableDataChanged();
        return result;
    }
    public int searchItem(String id,String tenBaiHat,String tacGia,String xepHang){
        ArrayList<Song> alSong = new ArrayList<Song>();
        alSong = model.getListSearch(id,tenBaiHat,tacGia,xepHang);
        this.fireTableDataChanged();
        if(alSong.isEmpty()){
            return 0;
        }else{
            return alSong.size();
        }
    }
}
