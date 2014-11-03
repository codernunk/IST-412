import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
 
/**
 * Provides the main program to calculate the cost of 
 * a pizza given toppings and size.
 * 
 * @author Jesse Jurden
 * September 8, 2014
 */
public class PizzaCalculator extends JFrame {
    
    // Price constants
    final double PRICE_SMALL = 6.99;
    final double PRICE_MEDIUM = 8.99;
    final double PRICE_LARGE = 10.99;
    
    final double PRICE_SAUSAGE = 1.49;
    final double PRICE_PEPPERONI = 1.49;
    final double PRICE_SALAMI = 1.49;
    final double PRICE_OLIVES = 0.99;
    final double PRICE_MUSHROOMS = 0.99;
    final double PRICE_ANCHOVIES = 0.99;
    
    // GUI variables
    JRadioButton jrbSmall;
    JRadioButton jrbMedium;
    JRadioButton jrbLarge;
    
    JCheckBox jcbSausage;
    JCheckBox jcbOlives;
    JCheckBox jcbPepperoni;
    JCheckBox jcbMushrooms;
    JCheckBox jcbSalami;
    JCheckBox jcbAnchovies;    
    
    public PizzaCalculator()
    {
        setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
        //setLayout(new BorderLayout());
        
        // Construct the size JPanel
        JPanel jpSize = new JPanel(new FlowLayout(FlowLayout.LEFT,4,5));
        jpSize.setBorder(new TitledBorder("Size"));

        jrbSmall = new JRadioButton("Small");
        jrbSmall.setSelected(true);// Make small selected by default
        jrbMedium = new JRadioButton("Medium");
        jrbLarge = new JRadioButton("Large");
        
        ButtonGroup sizes = new ButtonGroup();
        
        sizes.add(jrbSmall);
        sizes.add(jrbMedium);
        sizes.add(jrbLarge);
        
        jpSize.add(jrbSmall);
        jpSize.add(jrbMedium);
        jpSize.add(jrbLarge);
        
        add(jpSize,BorderLayout.NORTH);
        
        // Toppings
        JPanel jpToppings = new JPanel(new GridLayout(3,2,15,10));
        jpToppings.setBorder(new TitledBorder("Toppings"));
                
        jcbSausage = new JCheckBox("Sausage");
        jcbOlives = new JCheckBox("Olives");
        jcbPepperoni = new JCheckBox("Pepperoni");
        jcbMushrooms = new JCheckBox("Mushrooms");
        jcbSalami = new JCheckBox("Salami");
        jcbAnchovies = new JCheckBox("Anchovies");                      
        
        jpToppings.add(jcbSausage);
        jpToppings.add(jcbOlives);
        jpToppings.add(jcbPepperoni);
        jpToppings.add(jcbMushrooms);
        jpToppings.add(jcbSalami);
        jpToppings.add(jcbAnchovies);
        
        add(jpToppings,BorderLayout.CENTER);
        
        // Price
        //JPanel jpPrice = new JPanel(new FlowLayout());
        
        JLabel jlPrice = new JLabel("Price: ");
        JTextField jtfPrice = new JTextField(10);
        jtfPrice.setEditable(false);
        jtfPrice.setSize(110, 20);
        //jpPrice.add(jlPrice);
        //jpPrice.add(jtfPrice);
        
        //add(jpPrice);
        add(jlPrice);
        add(jtfPrice);
        
        // Action buttons
        JPanel jpButtons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton jbCalc = new JButton("Calculate");
        JButton jbExit = new JButton("Exit");
        
        // Add the 
        jbCalc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                double price = calcPizzaPrice();
                
                jtfPrice.setText(String.format("$%.2f",price));
            }
        });
 
        jbExit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
        
        jpButtons.add(jbCalc);
        jpButtons.add(jbExit);
        
        add(jpButtons);
    }
    
    /**
     * Runs the main application.
     */
    public static void main(String[] args)
    {
        JFrame pizzaWindow = new PizzaCalculator();
        pizzaWindow.setTitle("Pizza Calculator");
        pizzaWindow.setSize(240,315);
        pizzaWindow.setLocationRelativeTo(null);
        pizzaWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pizzaWindow.setVisible(true);
    }
    
    /**
     * Calculates the price of the pizza given the GUI parameters.
     */
    private double calcPizzaPrice()
    {
        double price = 0;
        
        // Pizza Size
        if (jrbMedium.isSelected())
        {
            price = PRICE_MEDIUM;
        }else if (jrbLarge.isSelected())
        {
            price = PRICE_LARGE;
        }else{
            price = PRICE_SMALL;
        }
        
        // Add additional cost for each topping
        if (jcbSausage.isSelected())
            price += PRICE_SAUSAGE;
        if (jcbPepperoni.isSelected())
            price += PRICE_PEPPERONI;
        if (jcbSalami.isSelected())
            price += PRICE_SALAMI;
        if (jcbOlives.isSelected())
            price += PRICE_OLIVES;
        if (jcbMushrooms.isSelected())
            price += PRICE_MUSHROOMS;
        if (jcbAnchovies.isSelected())
            price += PRICE_ANCHOVIES;
        
        return price;
    }
}
