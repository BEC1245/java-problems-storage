package iteration;

import java.util.ArrayList;

public class lottoNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < 7;){
            int input = (int)(Math.random() * 21);
            if(nums.contains(input)){
                continue;
            }
            i++;
            nums.add(input);
        }

        long attempt = 0;
        Boolean jeckpot = false;
        while(jeckpot == false){
            ArrayList<Integer> gacha = new ArrayList<>();
            attempt++;

            for(int i = 0; i < nums.size();){
                int random = (int)(Math.random() * 21);
                if(gacha.contains(random)){
                    continue;
                }

                if(random != nums.get(i)){
                    break;
                }

                i++;
                gacha.add(random);
                System.out.println(attempt + " / " + random);
                jeckpot = (i == nums.size()) ? true : false;
            }
        }

        for(var a : nums){
            System.out.print(a +  " ");
        }
        System.out.println();
        System.out.println(attempt);
    }
}
