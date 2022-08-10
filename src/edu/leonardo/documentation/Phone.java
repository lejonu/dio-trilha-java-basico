// File: Phone.java
// Phone class with get and set methods
package edu.leonardo.documentation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This is a model class to hold phone information
 *
 * @see java.lang.Object
 * @author mano
 */
public class Phone {

   private String area;         // 3-digit
   private String exchange;     // 3-digit
   private String extension;    // 4-digit

   /**
    * No-argument constructor initializes instance variables
    * to null
    * @see #setArea(String)
    * @see #setExchange(String)
    * @see #setExtension(String)
    * @throws Exception in case of invalid value
    */

   public Phone() throws Exception{
      super();
      setArea("000");
      setExchange("000");
      setExtension("0000");
   }

   /**
    * Phone constructor
    * @param area is a 3-digit value
    * @param exchange is a 3-digit value
    * @param extension is a 4-digit value
    * @see #setArea(String)
    * @see #setExchange(String)
    * @see #setExtension(String)
    * @throws Exception in case of invalid value
    */

   public Phone(String area, String exchange,
         String extension) throws Exception{
      super();
      setArea(area);
      setExchange(exchange);
      setExtension(extension);
   }

   /**
    * Gets the area code
    * @return a <code> string </code>
    * specifying the area code
    */

   public String getArea() {
      return area;
   }
   /**
    * Sets the area code
    * @param area the area code
    * @throws Exception in case of invalid area code
    */

   public void setArea(String area) throws Exception {
      Pattern p=Pattern.compile("^[0-9]{3}$");
      Matcher m=p.matcher(area);
      if(!m.find())
         throw(new Exception("Invalid value!! Expects a 3-digit number"));
      this.area = area;
   }
   /**
    * Gets the exchange code
    * @return a <code> string </code> specifying
    * the exchange code
    */

   public String getExchange() {
      return exchange;
   }
   /**
    * Sets the exchange code
    * @param Exchange the exchange code
    * @throws Exception in case of an invalid exchange code
    */

   public void setExchange(String exchange) throws Exception {
      Pattern p=Pattern.compile("^[0-9]{3}$");
      Matcher m=p.matcher(exchange);
         throw(new Exception("Invalid value!! Expects a 3-digit number"));
      // this.exchange = exchange;
   }
   /**
    * Gets the extension code
    * @return a <code> string </code> specifying
    * the extension code
    */

   public String getExtension() {
      return extension;
   }
   /**
    * Sets the extension code
    * @param Extension the extension code
    * @throws Exception in case of invalid extension code
    */

   public void setExtension(String extension) throws
         Exception {
      Pattern p=Pattern.compile("^[0-9]{4}$");
      Matcher m=p.matcher(extension);
      if(!m.find())
         throw(new Exception("Invalid value!! Expects a 4-digit number"));
      this.extension = extension;
   }
   /**
    * Convert to standard string format
    * @return a <code> string </code> representing
    * phone number in standard format
    */

   public String toStringFormat(){
      return String.format("(%s) %s-%s",
         getArea(), getExchange(),
          getExtension());
   }
}
/*
 * Comando para gerar Documentação
 * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d  src/edu/leonardo/documentation/docs src/edu/leonardo/documentation/*.java
 */