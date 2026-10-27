import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        ArrayList<String> Groceries = new ArrayList<>();
        ArrayList<Integer> GroceryCost = new ArrayList<>();

        ArrayList<String> Medical = new ArrayList<>();
        ArrayList<Integer> MedicalCost = new ArrayList<>();

        //Grocery entries
        Groceries.add("Rice");
        GroceryCost.add(330);

        Groceries.add("MintyJamun");
        GroceryCost.add(255);

        Groceries.add("Sugar");
        GroceryCost.add(65);

        //Medical entries
        Medical.add("Dolo360");
        MedicalCost.add(82);

        Medical.add("FolicalHair");
        MedicalCost.add(367);

        Medical.add("FirstAidKit");
        MedicalCost.add(120);

        int total = 0;
        for (int cost : GroceryCost) {
            total += cost;

        }
        for (int cost : MedicalCost) {
            total += cost;
        }
        System.out.println(" before total: " + total);

        if (total > 1020) {
            total = total - GroceryCost.get(1);
            Groceries.remove(1);
            GroceryCost.remove(1);

            total = total - MedicalCost.get(1);
            Medical.remove(1);
            MedicalCost.remove(1);
        }
        System.out.println(" Final total: " + total);
        System.out.println("Groceries:" + Groceries);
        System.out.println("Medical:" + Medical);
    }
}
