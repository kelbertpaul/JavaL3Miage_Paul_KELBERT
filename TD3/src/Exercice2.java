import java.util.ArrayList;

public class Exercice2 {

    public static ArrayList<Integer> maxElement(ArrayList<Integer> l1, ArrayList<Integer> l2, ArrayList<Integer> l3){
        if(l1.size()==l2.size() && l1.size()==l3.size()){
            ArrayList<Integer> res = new ArrayList<>();
            for(int i=0; i<l1.size(); i++){
                res.add(Integer.max(Integer.max(l1.get(i), l2.get(i)), l3.get(i)));
            }
            return res;
        } else {
            System.out.println("Les listes ne sont pas de ma meme taille !");
            return new ArrayList<>();
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(6);
        l1.add(8);
        l1.add(4);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(2);
        l2.add(3);
        l2.add(5);
        l2.add(18);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(6);
        l3.add(0);
        l3.add(2);
        l3.add(12);
        l3.add(14);

        System.out.println("Listes de même taille avec des int: ");
        maxElement(l1, l2, l3).forEach(System.out::println);
//        sommeList(l1,l2).forEach(System.out::println);
//
//
//        System.out.println("\nListes de taille différente : ");
//        ArrayList<Integer> l3 = new ArrayList<>();
//        l3.add(13);
//        l3.add(21);
//        l3.add(34);
//        l3.add(55);
//        ArrayList<Integer> l4 = new ArrayList<>();
//        l4.add(6);
//        l4.add(7);
//        l4.add(8);
//        l4.add(9);
//        l4.add(10);
//        sommeList(l3, l4).forEach(System.out::println);
    }

}
