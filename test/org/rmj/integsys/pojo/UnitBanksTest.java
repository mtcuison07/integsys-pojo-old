/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.integsys.pojo;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kalyptus
 */
public class UnitBanksTest {

    public UnitBanksTest() {
    }

   @BeforeClass
   public static void setUpClass() throws Exception {
   }

   @AfterClass
   public static void tearDownClass() throws Exception {
   }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

   /**
    * Test of getBankID method, of class UnitBanks.
    */
   @Test
   public void testColumnByName() {
      System.out.println("testColumnByName");
      UnitBanks instance = new UnitBanks();
      for(int x = 1; x <= instance.getColumnCount(); x++){
         System.out.print("Fields: " + instance.getColumn(x));
         System.out.println("»" + instance.getColumn(instance.getColumn(x)));
      }
      assertEquals(instance.getColumn(1), "sBankIDxx");
   }
   
   @Test
   public void testColumnCount() {
      System.out.println("testColumnCount");
      UnitBanks instance = new UnitBanks();
      assertEquals(10, instance.getColumnCount());
   }
}