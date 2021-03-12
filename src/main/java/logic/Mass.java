package logic;

public class Mass {

    public static void modulo(int[] mass){
        try {
            for (int i : mass){
                if (i % 3 == 0){
                    System.out.println(i);
                }
            }
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
