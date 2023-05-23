package com.example.ucas;

public class inpot1 {
    private String name;

    public String getName() {
        return name;
    }

    public inpot1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
interface OnClickListener {
            void onClick();

            void onDelete(int positen);
   }
}
