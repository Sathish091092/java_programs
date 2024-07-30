package Demo;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Array {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int min=salaries[0];
        int sechi=salaries[0];

        for (int i = 0; i <salaries.length ; i++) {
            if(min<salaries[i]){
                min=salaries[i];
            }
        }
        for (int j = 0; j <salaries.length ; j++) {
            if(sechi<salaries[j]){
                if (min != salaries[j]) {
                    sechi=salaries[j];

                }
            }

        }
        System.out.println(min);
        System.out.println(sechi);
    }
}
