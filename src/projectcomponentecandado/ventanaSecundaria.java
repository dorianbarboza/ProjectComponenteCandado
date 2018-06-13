package projectcomponentecandado;

import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Dorian Barboza
 */

public class ventanaSecundaria extends JPanel implements Runnable,ActionListener {
    Crud buscarRegistros;
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(0,0,300,800);
    }
    @Override
    public void run() {
        Label lbMensaje2 = new Label("Ingresar datos");
        lbMensaje2.setBounds(20, 10, 210, 25);
        lbMensaje2.setForeground(Color.BLACK);
        lbMensaje2.setBackground(Color.WHITE);
        
        Button btnInsertar;
        btnInsertar = new Button("Insertar");
        btnInsertar.setBounds(50, 350, 200, 60);
        btnInsertar.setActionCommand("Insertar");
        btnInsertar.addActionListener(this);
        this.add(btnInsertar);
        this.setVisible(true);
        
        TextField txtNombre;
        txtNombre = new TextField();
        txtNombre.setBounds(80, 40, 90, 25);
        
        TextField txtApellido;
        txtApellido = new TextField();
        txtApellido.setBounds(80, 40, 90, 25);
        
        TextField txtCarrera;
        txtCarrera = new TextField();
        txtCarrera.setBounds(80, 40, 90, 25);
        
        TextField txtNumControl;
        txtNumControl = new TextField();
        txtNombre.setBounds(80, 40, 90, 25);
        
        Label lbMensajeNombre = new Label("Nombre");
        lbMensajeNombre.setBounds(20, 10, 210, 25);
        lbMensajeNombre.setForeground(Color.BLACK);
        lbMensajeNombre.setBackground(Color.WHITE);
        
        Label lbMensajeApellido = new Label("Apellido");
        lbMensajeApellido.setBounds(20, 10, 210, 25);
        lbMensajeApellido.setForeground(Color.BLACK);
        lbMensajeApellido.setBackground(Color.WHITE);
        
        Label lbMensajeCarrera = new Label("Carrera");
        lbMensajeCarrera.setBounds(20, 10, 210, 25);
        lbMensajeCarrera.setForeground(Color.BLACK);
        lbMensajeCarrera.setBackground(Color.WHITE);
        
        Label lbMensajeNumControl = new Label("Numero Control");
        lbMensajeNumControl.setBounds(20, 10, 210, 25);
        lbMensajeNumControl.setForeground(Color.BLACK);
        lbMensajeNumControl.setBackground(Color.WHITE);
        
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void start() {
        }
    
}
