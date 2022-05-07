package com.company;

public class pencil {


        public String color = "yellow" ;
        public int length = 15;
        public double price = 100.00;

        void display(){
            System.out.println("Color "+"  "+this.color);
            System.out.println("Length "+"  "+this.length);
            System.out.println("Price "+"  "+this.price);
        }


        public static void main(String[] args) {
            pencil pencil = new  pencil();
            pencil.display();

    }







}
