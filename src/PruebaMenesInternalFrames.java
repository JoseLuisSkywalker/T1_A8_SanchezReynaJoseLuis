import java.awt.*;
import javax.swing.*;


class VentanaInicio extends JFrame{
	JMenu menuMasters, menuBooking, menuTestPerform, menuPrinting, menuTransaction, menuLabReports,
	menuSettings, menuUtilities, menuWindow, menuHelp; 
	
	JToolBar toolBar; 
	
	public VentanaInicio() {
		//construcción ventana
		setLayout(new BorderLayout());
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setTitle("Lab Master - Test Booking");
	    setSize(1000, 700);
	    setLocationRelativeTo(null); 
	    setVisible(true);
	    
	    //-------------- MENU ----------------
	    JMenuBar menuBar = new JMenuBar();
	    	menuMasters = new JMenu("Masters");
	    	menuBar.add(menuMasters);
	    	
	    	menuBooking = new JMenu("Booking"); 
	    	menuBar.add(menuBooking); 
	    	
	    	menuTestPerform = new JMenu("TestPerform"); 
	    	menuBar.add(menuTestPerform); 
	    	
	    	menuPrinting = new JMenu("Printing");
	    	menuBar.add(menuPrinting); 
	    	
	    	menuTransaction = new JMenu("Transaction"); 
	    	menuBar.add(menuTransaction); 
	    	
	    	menuLabReports = new JMenu("Lab Reports"); 
	    	menuBar.add(menuLabReports); 
	    	
	    	menuSettings = new JMenu("Settings"); 
	    	menuBar.add(menuSettings); 
	    	
	    	menuUtilities = new JMenu("Utilities"); 
	    	menuBar.add(menuUtilities); 
	    	
	    	menuWindow = new JMenu("Window"); 
	    	menuBar.add(menuWindow); 
	    	
	    	menuHelp = new JMenu("Help"); 
	    	menuBar.add(menuHelp); 
	    
	    //Añade el menubar
	    setJMenuBar(menuBar);
	    
	    
	    //---------- TOOLBAR --------------------
	    
	    toolBar = new JToolBar();
	   
	    	//button para add en el toolbar
	    	JButton btnToolbarAdd = new JButton("Add");
	    	btnToolbarAdd.setIcon(new ImageIcon("./imagenes/add4.png"));
	    	//estos metodos son para acomodar el boton para que se vea mas bonito. 
	    	btnToolbarAdd.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarAdd.setHorizontalTextPosition(SwingConstants.CENTER);
	    	//metodos para dimensionar a los botones de forma bonita
	    	//de mismo tamaño para que no depende de imagenes.
	    	btnToolbarAdd.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarAdd.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarAdd.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarAdd); 
	    	
	    	//button edit del toolbar
	    	JButton btnToolbarEdit = new JButton("Edit");
	    	btnToolbarEdit.setIcon(new ImageIcon("./imagenes/edit4.png")); 
	    	btnToolbarEdit.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarEdit.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarEdit.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarEdit.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarEdit.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarEdit); 
	    	
	    	//boton back
	    	JButton btnToolbarBack = new JButton("Back"); 
	    	btnToolbarBack.setIcon(new ImageIcon("./imagenes/back2.png")); 
	    	btnToolbarBack.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarBack.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarBack.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarBack.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarBack.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarBack); 
	    	
	    	//boton next
	    	JButton btnToolbarNext = new JButton("Next"); 
	    	btnToolbarNext.setIcon(new ImageIcon("./imagenes/next.png")); 
	    	btnToolbarNext.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarNext.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarNext.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarNext.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarNext.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarNext); 
	    	
	
	    	JButton btnToolbarList = new JButton("List"); 
	    	btnToolbarList.setIcon(new ImageIcon("./imagenes/list.png")); 
	    	btnToolbarList.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarList.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarList.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarList.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarList.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarList); 
	    	
	    	JButton btnToolbarSave = new JButton("Save"); 
	    	btnToolbarSave.setIcon(new ImageIcon("./imagenes/save.png")); 
	    	btnToolbarSave.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarSave.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarSave.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarSave.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarSave.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarSave); 
	    	
	    	JButton btnToolbarPrint = new JButton("Print"); 
	    	btnToolbarPrint.setIcon(new ImageIcon("./imagenes/print.png")); 
	    	btnToolbarPrint.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarPrint.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarPrint.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarPrint.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarPrint.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarPrint); 
	    	
	    	JButton btnToolbarTest = new JButton("Test"); 
	    	btnToolbarTest.setIcon(new ImageIcon("./imagenes/test.png")); 
	    	btnToolbarTest.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarTest.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarTest.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarTest.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarTest.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarTest); 
	    	
	    	JButton btnToolbarCancel = new JButton("Cancel"); 
	    	btnToolbarCancel.setIcon(new ImageIcon("./imagenes/cancel.png")); 
	    	btnToolbarCancel.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarCancel.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarCancel.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarCancel.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarCancel.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarCancel); 
	    	
	    	JButton btnToolbarSettings = new JButton("Settings"); 
	    	btnToolbarSettings.setIcon(new ImageIcon("./imagenes/settings.png")); 
	    	btnToolbarSettings.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarSettings.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarSettings.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarSettings.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarSettings.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarSettings); 
	    	
	    	JButton btnToolbarDelete = new JButton("Delete"); 
	    	btnToolbarDelete.setIcon(new ImageIcon("./imagenes/delete.png")); 
	    	btnToolbarDelete.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarDelete.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarDelete.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarDelete.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarDelete.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarDelete);
	    	
	    	JButton btnToolbarSlip = new JButton("Slip"); 
	    	btnToolbarSlip.setIcon(new ImageIcon("./imagenes/slip.png")); 
	    	btnToolbarSlip.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarSlip.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarSlip.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarSlip.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarSlip.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarSlip);
	    	
	    	JButton btnToolbarExit = new JButton("Exit"); 
	    	btnToolbarExit.setIcon(new ImageIcon("./imagenes/exit.png")); 
	    	btnToolbarExit.setVerticalTextPosition(SwingConstants.BOTTOM);
	    	btnToolbarExit.setHorizontalTextPosition(SwingConstants.CENTER); 
	    	btnToolbarExit.setPreferredSize(new Dimension(70, 70));
	    	btnToolbarExit.setMinimumSize(new Dimension(70, 70));
	    	btnToolbarExit.setMaximumSize(new Dimension(70, 70)); 
	    	toolBar.add(btnToolbarExit);
		
	   
	    //Añade el toolbar
	    add(toolBar, BorderLayout.PAGE_START);
		
	    
	    
	    //----------------- primer panel -------------------- 
	    
	    JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panel1.setBorder(BorderFactory.createTitledBorder("Patient Information"));

        JLabel labelPatientId = new JLabel("Patient ID:");
        JTextField textPatientId = new JTextField(15);

        panel1.add(labelPatientId);
        panel1.add(textPatientId);

        add(panel1, BorderLayout.CENTER);
	    
	   
	} 
	
	

	
}

public class PruebaMenesInternalFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	                new VentanaInicio();
	            }
	        });
	}

}
