
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Model;
import view.View;

public class Controller implements ActionListener
{
    /**
     * Se inicializan las variables miembro
     */
    Model model;
    View view;
     /**
     * En esta clase colocamos las variables que van a ser tomadas como parametros
     * 
     * @param view
     * Variable para acceder a nuestra vista ymodificar sus componentes
     * @param model 
     * Variable para acceder a nuestro modelo y a sus get y set
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
          
        this.view.jb_imc.addActionListener(this);
    }
     /**
     * En el metodo actionPerformed se colocaran las acciones que se realizan mediante el contacto 
     * con la interfaz, recoge una variable ActionEvent para poder realizar los distintos metodos
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.view.jb_imc){
            calcularimc();
        }
    }
    
    /**
     * Metodo que recoge la altura y el peso para determinar el IMC de un individuo
     */
    private void calcularimc(){
        try{
            double peso = Double.parseDouble(this.view.jtf_peso.getText());
            double estatura = Double.parseDouble(this.view.jtf_estatura.getText());
            if (peso <= 0 || peso >= 250){
                JOptionPane.showMessageDialog(null, "El rango de peso no es correcto");
            }
            else if (estatura <= 1 || estatura >= 2.4){
                JOptionPane.showMessageDialog(null, "El rango de estatura no es correcto");
            }
            JOptionPane.showMessageDialog(null, "Tu índice de masa corporal es: " + this.model.calcularimc(peso, estatura));
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar números");
        }
    }
    /**
     * Metodo para inicializar el jForm y que sea visible
     */
   public void initView(){
        this.view.setTitle("IMC");
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
}
