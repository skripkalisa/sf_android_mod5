public class Knight {
    private String name = "Sir Thanks-A-Lot";
    private String weapon = "Long Sword";
    private Boolean isGoingToSavePrincess = true;

//       public void goAndSaveThePrincess() {
//           System.out.println("Точим мечь");
//           System.out.println("Собираем консервы");
//           System.out.println("Будим оруженосца");
//
//           System.out.println("Да иду уже...");
//   }
public void goAndSaveThePrincess() {
    sharpenBlade();
    getFood();
    assembleTeam();
    System.out.println("Да иду уже...");
}

    private void sharpenBlade() {
        System.out.println("Точим мечь");
    }
    private void getFood() {
        System.out.println("Собираем консервы");
    }
    private void assembleTeam() {
        System.out.println("Будим оруженосца");
    }
}
