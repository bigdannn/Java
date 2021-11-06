package lesson9;

public class parking {
    public static void main(String[] args) {

        boolean[][][] parking = {
                // level 0
                {
                    //row 0
                        {true, false, true},
                        //row 1
                        {true, false, true},
                        //row 2
                        {true, false, true}
                },
                //level 1
                {{true, true, false},{true, true, false},{true, true, false}},
                //level 2
                {{true, true, false},{true, true, false},{true, true, false}}
        };

        for (int i = 0; i < parking.length; i++) {
            System.out.println("Level " + i);

            for (int j = 0; j < parking[i].length; j++) {
                for (int k = 0; k < parking[i][j].length; k++) {

                    System.out.print(parking[i][j][k] + " ");

                }
                System.out.println();
            }
        }



     }
}
