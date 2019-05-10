/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest;

/**
 *
 * @author elija
 */
public class Item 
{
    String name, company;
    int quant;
    public Item(String medName, String compName, int quantity)
    {
        name = medName;
        company = compName;
        quant = quantity;
    }
    
   public String getMedName()
   {
       return name;
   }
   
   public String getCompName()
   {
       return company;
   }
   
   public int getQuantity()
           {
               return quant;
           }
    
}
