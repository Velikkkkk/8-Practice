public class Team {
   private String name;
   private int win_total;
   private int loss_total;
   private int tie_total;
   private int total_goals_scord;
   private int total_goals_allowd;

   // Constructor
   public Team (String name){
       this.name = name;
   }

   // gettings and settings

   public String getName() {return name;}
   public void setName(String name) {
      this.name = name;
   }

   public int getWin_total() {
      return win_total;
   }
   public void setWin_total(int win_total) {
      this.win_total = win_total;
   }

   public int getLoss_total() {
      return loss_total;
   }
   public void setLoss_total(int loss_total) {
      this.loss_total = loss_total;
   }

   public int getTie_total() {
      return tie_total;
   }
   public void setTie_total(int tir_total) {
      this.tie_total = tie_total;
   }

   public int getTotal_goals_scord() {
      return total_goals_scord;
   }
   public void setTotal_goals_scord(int total_goals_scord) {
      this.total_goals_scord = total_goals_scord;
   }

   public int getTotal_games_allowd() {
      return total_goals_allowd;
   }
   public void setTotal_games_allowd(int total_games_allowd) {
      this.total_goals_allowd = total_games_allowd;
   }

   public void  print_stats(){
      System.out.println(name);
      System.out.print("Wins:" + win_total + " ,");
      System.out.println("Losses:" + loss_total + " ,");
      System.out.print("Tires:" + tie_total + " ,");
      System.out.println("Points scored:" + total_goals_scord + " ," + "Points allowd:" + total_goals_allowd);
      System.out.println();
   }

}
