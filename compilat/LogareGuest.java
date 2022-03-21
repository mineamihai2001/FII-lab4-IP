/*    */ package compilat;
/*    */ import com.company.MeniuLogare;
/*    */ 
/*    */ public class LogareGuest extends MeniuLogare {
/*    */   private String username;
/*    */   
/*    */   public String getUsername() {
/*  8 */     return this.username;
/*    */   } private String password;
/*    */   public String getPassword() {
/* 11 */     return this.password;
/*    */   }
/*    */   public void setRandomUsername() {
/* 14 */     this.username = String.valueOf(Math.random());
/* 15 */     this.password = "";
/*    */   }
/*    */ }


/* Location:              D:\git\GitHub\lab4-IP\!\compilat\LogareGuest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */