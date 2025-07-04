package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    public JDesktopPane desktop; // Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarrera;
    private JMenuItem JMenuItemVerCarreras;

 
    public VentanaPrincipal(String tittle){
        this.setTitle(tittle);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // DesktopPane - escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        // Barra de Menu
        jMenuBar = new JMenuBar();
        this.add(jMenuBar);
        // Menu alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        // Elemento de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar");
        // Elemento de menu: Ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos");

        // Menu carreras
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        // Elemento de menu: Carreras
        JMenuItemVerCarreras = new JMenuItem();
        JMenuItemVerCarreras.setText("Ver todas las carreras");

        jMenuItemInsertarCarrera = new JMenuItem();
        jMenuItemInsertarCarrera.setText("Insertar");
        jMenuItemInsertarCarrera.addActionListener(e -> {
            JInternalFrameInsertarCarrera insertarCarrera = new JInternalFrameInsertarCarrera();
            insertarCarrera.setVisible(true);
            this.desktop.add(insertarCarrera);
        });


        // Agregar menuItema menu
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        jMenuCarreras.add(JMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarrera);
        jMenuBar.add(jMenuCarreras);


        this.setJMenuBar(jMenuBar);
        pack();
    }
}
