package main;

import model.Model;
import view.View; 
import controller.Controller;

public class Main {
     /**
     * creacion de las variables miembro
     */
    Model model;
    View view;
    Controller controller;
    /**
     * Se crean los constructores que van a llamar a las clases en esta clase Main
     */
    public static void main (String [] args ){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.initView();
    }
}