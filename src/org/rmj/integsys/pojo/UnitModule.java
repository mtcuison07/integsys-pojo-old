/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.rmj.integsys.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;
import org.rmj.appdriver.iface.GEntity;

/**
 *
 * @author jef
 */
@Entity
@Table(name = "EDocSys_Module")

public class UnitModule implements Serializable, GEntity{
   private static final long serialVersionUID = 1L;
   @Id
   @Basic(optional = false)
   @Column(name = "sModuleCd")
   private String sModuleCd;
   @Column(name = "sModuleNm")
   private String sModuleDs;
   @Column(name = "cRecdStat")
   private String cRecdStat;
   @Column(name = "sModified")
   private String sModified;
   @Basic(optional = false)
   @Column(name = "dModified")
   @Temporal(TemporalType.TIMESTAMP)
   private Date dModified;
   
      //Member Variables here
   LinkedList laColumns = null;
 
   public UnitModule() {
      this.sModuleCd = "";
      this.sModuleDs = "";
      this.cRecdStat = RecordStatus.ACTIVE;

      //set vector for fields/columns
      laColumns = new LinkedList();
      laColumns.add("sModuleCd");
      laColumns.add("sModuleDs");
      laColumns.add("cRecdStat");
      laColumns.add("sModified");
      laColumns.add("dModified");

   }

   public String getModuleCd() {
      return sModuleCd;
   }

   public void setModuleCd(String sModuleCd) {
      this.sModuleCd = sModuleCd;
   }

   public String getModuleDs() {
      return sModuleDs;
   }

   public void setModuleDs(String sModuleDs) {
      this.sModuleDs = sModuleDs;
   }

   public String getRecdStat() {
      return cRecdStat;
   }

   public void setRecdStat(String cRecdStat) {
      this.cRecdStat = cRecdStat;
   }

   public String getModifiedBy() {
      return sModified;
   }

   public void setModifiedBy(String sModified) {
      this.sModified = sModified;
   }

   public Date getDateModified() {
      return dModified;
   }

   public void setDateModified(Date dModified) {
      this.dModified = dModified;
   }

   @Override
   public int hashCode() {
      int hash = 0;
      hash += (sModuleCd != null ? sModuleCd.hashCode() : 0);
      return hash;
   }

   @Override
   public boolean equals(Object object) {
      // TODO: Warning - this method won't work in the case the id fields are not set
      if (!(object instanceof UnitModule)) {
         return false;
      }
      UnitModule other = (UnitModule) object;
      if ((this.sModuleCd == null && other.sModuleCd != null) || (this.sModuleCd != null && !this.sModuleCd.equals(other.sModuleCd))) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "org.rmj.integsys.pojo.UnitModule[sModuleCd=" + sModuleCd + "]";
   }

   @Override
    public Object getValue(String fsColumn){
       int lnCol = getColumn(fsColumn);
       
       if(lnCol > 0){
          return getValue(lnCol);
       }
       else
         return null;
    }

   @Override
   public Object getValue(int fnColumn) {
    switch(fnColumn){
         case 1:
            return sModuleCd;
         case 2:
            return sModuleDs;
         case 3:
            return cRecdStat;
         case 4:
            return sModified;
         case 5:
            return dModified;
         default:
            return null;
      }
   }

   @Override
   public String getTable() {
      return "EDocSys_Module";
   }

   @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

   @Override
    public String getColumn(int fnCol) {
       if(laColumns.size() < fnCol)
           return "";
       else
           return (String) laColumns.get(fnCol - 1);
    }

   @Override
    public void setValue(String fsColumn, Object foValue){
       int lnCol = getColumn(fsColumn);
       if(lnCol > 0){
          setValue(lnCol, foValue);
       }
    }

   @Override
   public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1:
                sModuleCd = (String)foValue;
                break;
            case 2:
                sModuleDs = (String)foValue;
                break;
            case 3:
                cRecdStat = (String)foValue;
                break;
            case 4:
                sModified = (String)foValue;
                break;
            case 5:
                dModified = (Date)foValue;
                break;
        }
   }

   @Override
   public int getColumnCount() {
      return laColumns.size();
   }

    @Override
    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }

}