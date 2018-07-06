package com.example.vanluc.webview_listview_recyleview_gridview;

public class RyclerView {
    private int anh;
    private String ten;

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public RyclerView() {

    }

    public RyclerView(int anh, String ten) {

        this.anh = anh;
        this.ten = ten;
    }
}
