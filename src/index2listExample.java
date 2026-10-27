import java.util.ArrayList;
public class index2listExample {
    public static void main(String[] args) {
        ArrayList<String> Groceries = new ArrayList<>();
        ArrayList<Integer> GroceryCost = new ArrayList<>();

        ArrayList<String> Medical = new ArrayList<>();
        ArrayList<Integer> MedicalCost = new ArrayList<>();

        //names entries
        Groceries.add("Rice");
        Groceries.add("MintyJamun");
        Groceries.add("Sugar");
        Medical.add("Dolo360");
        Medical.add("FolicalHair");
        Medical.add("FirstAidKit");

        //price entries
        GroceryCost.add(330);
        GroceryCost.add(255);
        GroceryCost.add(65);
        MedicalCost.add(82);
        MedicalCost.add(367);
        MedicalCost.add(120);

        int total = 0;
        for (int cost : GroceryCost) {
            total += cost;

        }
        for (int cost : MedicalCost) {
            total += cost;
        }
        System.out.println("before total" + total);

        if (total > 1020) {
            total = total - GroceryCost.get(1);
            Groceries.remove(1);
            GroceryCost.remove(1);

            total = total - MedicalCost.get(1);
            Medical.remove(1);
            MedicalCost.remove(1);
        }
        System.out.println("Final total:" + total);
        System.out.println("Groceries:" + Groceries);
        System.out.println("Medical:" + Medical);
    }

    }
